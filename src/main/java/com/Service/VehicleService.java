  package com.Service;

import com.Dto.VehicleDto;
import com.InMemory.InMemoryDatabase;

public class VehicleService {

	public VehicleDto getVehicleById(Integer id) {
		return InMemoryDatabase.vehicleList.get(id);
	}

}
