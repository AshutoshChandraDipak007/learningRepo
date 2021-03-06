package com.org.transport.pkg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.org.transport.pkg.model.FuelDTO;

public interface FuelRepository extends JpaRepository<FuelDTO,Long> {
	
	@Query(value ="SELECT d.d_name, v.v_make,v.v_model,d.plant FROM driver d,vehicle v,driver_vehicle dv where d.driver_id=dv.driverdto_driver_id and v.vehicle_id=dv.vehicle_vehicle_id and v.vehicle_no= ?1",nativeQuery = true)
	public List<FuelDTO> findByVehicleNo(String vehicleNo);
	
	/*
	 * @Query(value =
	 * "select id,name,roll_no from USER_INFO_TEST where rollNo = ?1", nativeQuery =
	 * true) ArrayList<IUserProjection> findUserUsingRollNo(String rollNo);
	 */

}
