package com.techshard.graphql.service;

import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.dao.repository.EngineerRepository;
import com.techshard.graphql.dao.repository.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
	@Autowired
	private EngineerRepository engineerRepository;
    private final VehicleRepository vehicleRepository ;

    public VehicleService(final VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Transactional
    public Vehicle createVehicle( String type,String modelCode,String brandName,String launchDate) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return this.vehicleRepository.save(vehicle);
    }
 
    @Transactional
    public String deleteVehicle(int id) {
    	vehicleRepository.deleteById(id);
    	return "Deleted..";	
    }
  @Transactional
  public Vehicle updateVehicle(int id,String type, String modelCode, String brandName, String launchDate) {
  	Vehicle vehicle = new Vehicle();
  	vehicle.setType(type);
  	vehicle.setModelCode(modelCode);
  	vehicle.setBrandName(brandName);
  	vehicle.setLaunchDate(LocalDate.parse(launchDate));
  	return this.vehicleRepository.save(vehicle);
	}
    
    @Transactional
    public List<Vehicle> getAllVehicles() {
        return this.vehicleRepository.findAll();
    }

    @Transactional
    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleRepository.findById(id);
    }
 
}
