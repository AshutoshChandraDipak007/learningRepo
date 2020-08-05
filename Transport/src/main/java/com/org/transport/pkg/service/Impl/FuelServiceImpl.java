package com.org.transport.pkg.service.Impl;

import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.transport.pkg.model.FuelDTO;
import com.org.transport.pkg.repository.FuelRepository;
import com.org.transport.pkg.service.FuelService;

@Service
public class FuelServiceImpl implements FuelService{
	
	@Autowired
	FuelRepository fuelRepository;
	
	@PostConstruct
	public void saveFuel() {
		LocalDate date=LocalDate.now();
		FuelDTO fuel=new FuelDTO("poonam","xyz",677,7876,234f,678,898,"kuchh bhi","uerur","wvfu",date);
		fuelRepository.save(fuel);
		
	}
	
		
	public int saveFuel(FuelDTO fuelDto)
	{
		FuelDTO fueDtoNew=new FuelDTO();
		fueDtoNew= fuelRepository.save(fuelDto);
		int result=0;
		if(fueDtoNew!=null) {
			result=1;
		}
		return result;
	}
	public List<FuelDTO> getFuel() 
	{
		return fuelRepository.findAll();
	}
	public List<FuelDTO> getFuelByVehicleNo(String vehicleNo) {
		return fuelRepository.findByVehicleNo(vehicleNo);
		
	}
}
