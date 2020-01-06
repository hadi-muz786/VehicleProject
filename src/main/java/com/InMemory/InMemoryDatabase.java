
package com.InMemory;

import java.util.HashMap;
import java.util.Map;

import com.Dto.VehicleDto;

public class InMemoryDatabase {

	public static Map<Integer, VehicleDto> vehicleList;
	static {

		vehicleList = new HashMap<Integer, VehicleDto>();

		VehicleDto vd = new VehicleDto();

		vd.setId(001);
		vd.setMake("Honda");
		vd.setType("Accord");
		vd.setModel("sedan");
		vehicleList.put(001, vd);

		VehicleDto vd1 = new VehicleDto();

		vd.setId(002);
		vd.setMake("camery");
		vd.setType("fjdhf");
		vd.setModel("mnmnm");
		vehicleList.put(002, vd1);

		VehicleDto vd2 = new VehicleDto();

		vd2.setId(003);
		vd2.setMake("kenjef");
		vd2.setType("fknekf");
		vd2.setModel("fmoewfew");
		vehicleList.put(003, vd2);

	}

}
