package org.mapping.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	private String userName;
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "VehicleID")
    //@Fetch(FetchMode.JOIN)//fetchmode.join diables lazy loading
	private Collection<Vehicle> vehicle = new ArrayList<Vehicle>();
	@Column(name = "InDate" )
	private Date InDate;
	
	public Date getInDate() {
		return InDate;
	}
	public void setInDate(Date inDate) {
		
		InDate = inDate;
	}

    public UserDetails() {
    }

    public UserDetails( String userName, Collection<Vehicle> vehicle, Date inDate) {
        //this.userId = userId;
        this.userName = userName;
        this.vehicle = vehicle;
        InDate = inDate;
    }

    public Collection<Vehicle> getVehicle() {
		return vehicle;
	}
	/*public void setVehicle(Collection<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}*/
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", vehicle=" + vehicle + ", InDate="
				+ InDate + "]";
	}
}
