 package com.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Dto.VehicleDto;
import com.Service.VehicleService;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

	private VehicleService vehicleService;

	@RequestMapping(value = "/{id}")
	public VehicleDto getVehicleByname(@PathVariable(value = "id") Integer vehicleId) {

		return vehicleService.getVehicleById(vehicleId);
	}


	@PostMapping
	public void createVehicle(@RequestBody VehicleDto vd) {
		System.out.println(vd.toString());
		
	}
		
		@PutMapping
		public void createVehicle1(@RequestBody VehicleDto vd1) {
			System.out.println(vd1.toString());
			
		
		 
	}
	public VehicleService getVehicleService() {
		return vehicleService;
	}

	public void setVehicleService(VehicleService vehicleService) {
		this.vehicleService = vehicleService;
	}

}
