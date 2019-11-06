package com.techshard.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.techshard.graphql.dao.entity.Vehicle;
import com.techshard.graphql.service.EngineerService;
import com.techshard.graphql.service.VehicleService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
	private EngineerService engineerService;
    
    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
  
    public String deleteVehicle(int id) {
		vehicleService.deleteVehicle(id);
    	return "Deleted..";
    }
    
    public Vehicle updateVehicle(final int id,final String type, final String modelCode,String brandName,final String launchDate) {
    	return this.vehicleService.updateVehicle(id, type, modelCode, brandName, launchDate);
  }
}
