/**
 * PersonServiceImplService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main.akhil;

public interface PersonServiceImplService extends javax.xml.rpc.Service {
    public java.lang.String getPersonServiceImplAddress();

    public main.akhil.PersonServiceImpl getPersonServiceImpl() throws javax.xml.rpc.ServiceException;

    public main.akhil.PersonServiceImpl getPersonServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
