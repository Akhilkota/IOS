package org.akhil.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "User_Details_Collection")
public class UserDetails {
	
	@Id	
	@GeneratedValue
	private int userid;
	private String userName;
	private Date joinedDate;
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name = "USER_ADDRESS" , joinColumns = @JoinColumn(name = "USER_ID"))
	@GenericGenerator(name = "halo-gen", strategy = "increment")
	@CollectionId(columns = { @Column(name = "ADDRESS_ID") }, generator = "halo-gen", type = @Type(type = "long"))
	private Collection<Address> addresses = new ArrayList<Address>();
	
	@Column(name = "InDate")
	private Date InDate;
	
	public Date getInDate() {
		return InDate;
	}
	public void setInDate(Date inDate) {
		InDate = new Date();
	}
	


	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

	private String description;
	
	public int getUserid() {
		return userid;
	}
	
	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
 
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
}
