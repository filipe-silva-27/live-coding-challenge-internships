package com.mercedes.interview.java;

import java.util.List;

public interface VehicleService {

    List<Integer> getAllVehiclesConstructionYearWithName(final List<Vehicle> vehicles, final String name);

    List<String> getAllExtras(final List<Vehicle> vehicles);

    Vehicle getVehicleWithConstructionYear(final List<Vehicle> vehicles, final int requiredConstructionYear);

    String getAnyVehicleWithName(final List<Vehicle> vehicles, final String name);

}