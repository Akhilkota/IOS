package org.mapping.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private int vehicleId;
	private String vehicleName;
	@Column(name = "InDate")
	private Date InDate;
	
	public Date getInDate() {
		return InDate;
	}
	public void setInDate(Date inDate) {
		InDate = inDate;
	}
	public int getVehicleId() {
		return vehicleId;
	}
	/*public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}*/
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

    public Vehicle() {
    }

    public Vehicle(String vehicleName, Date inDate) {
       // this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        InDate = inDate;
    }

    @Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleName=" + vehicleName + ", InDate=" + InDate + "]";
	}
}
