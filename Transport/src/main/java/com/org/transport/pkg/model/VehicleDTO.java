package com.org.transport.pkg.model;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Vehicle")
public class VehicleDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long vehicleId;
	private LocalDate manfDate;
	private String vehicleNo;
	private String vModel;
	private String vMake;
	private String assinplant;	
	private Long driverId;         
	
	/*
	 * @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name="vehicleId",referencedColumnName="driverId")
	 */
	@ManyToMany(mappedBy="vehicle")
	private List<DriverDTO> driver;
	
	public String getVehicleNo() {
		return vehicleNo;
	}

	
	public List<DriverDTO> getDriver() {
		return driver;
	}


	public void setDriver(List<DriverDTO> driver) {
		this.driver = driver;
	}


	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	
	public String getvModel() {
		return vModel;
	}

	
	public void setvModel(String vModel) {
		this.vModel = vModel;
	}

	public String getvMake() {
		return vMake;
	}

	public Long getDriverId() {
		return driverId;
	}

	public void setDriverId(Long driverId) {
		this.driverId = driverId;
	}

	public void setvMake(String vMake) {
		this.vMake = vMake;
	}

	public String getAssinplant() {
		return assinplant;
	}

	public void setAssinplant(String assinplant) {
		this.assinplant = assinplant;
	}

		

	public VehicleDTO(LocalDate manfDate, String vehicleNo, String vModel, String vMake, String assinplant,
			Long driverId) {
		super();
		this.manfDate = manfDate;
		this.vehicleNo = vehicleNo;
		this.vModel = vModel;
		this.vMake = vMake;
		this.assinplant = assinplant;
		this.driverId = driverId;
		}

	public Long getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Long vehicleId) {
		this.vehicleId = vehicleId;
	}

	public VehicleDTO() {
		super();
	}
	
	public LocalDate getManfDate() {
		return manfDate;
	}

	public void setManfDate(LocalDate manfDate) {
		this.manfDate = manfDate;
	}

	
	

	

}
