package main.akhil;

public class PersonServiceImplProxy implements main.akhil.PersonServiceImpl {
  private String _endpoint = null;
  private main.akhil.PersonServiceImpl personServiceImpl = null;
  
  public PersonServiceImplProxy() {
    _initPersonServiceImplProxy();
  }
  
  public PersonServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initPersonServiceImplProxy();
  }
  
  private void _initPersonServiceImplProxy() {
    try {
      personServiceImpl = (new main.akhil.PersonServiceImplServiceLocator()).getPersonServiceImpl();
      if (personServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)personServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)personServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (personServiceImpl != null)
      ((javax.xml.rpc.Stub)personServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.akhil.PersonServiceImpl getPersonServiceImpl() {
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl;
  }
  
  public main.akhil.Person[] getAllPersons() throws java.rmi.RemoteException{
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl.getAllPersons();
  }
  
  public boolean deletePerson(int id) throws java.rmi.RemoteException{
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl.deletePerson(id);
  }
  
  public boolean addPerson(main.akhil.Person p) throws java.rmi.RemoteException{
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl.addPerson(p);
  }
  
  public main.akhil.Person getPerson(int id) throws java.rmi.RemoteException{
    if (personServiceImpl == null)
      _initPersonServiceImplProxy();
    return personServiceImpl.getPerson(id);
  }
  
  
}