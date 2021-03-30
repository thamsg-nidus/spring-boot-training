package com.opennidus.training.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opennidus.training.Entity.Location;
import com.opennidus.training.Repository.Location_repository;


@Service
public class Location_service {

	@Autowired
	private Location_repository locationRepo;

	public List<Location> getAllLocations() {
		//return locationRepo.findAll();
		return locationRepo.getAllLocations();
	}
    
	public Optional<Location> getaLocation(int loc_id){
		return locationRepo.findById(loc_id);
				
	}

	public Location createLocation(Location location) {
		return locationRepo.save(location);
	}

	public Location updateLocation(Location location) {
		return locationRepo.save(location);
	}

	public void deleteLocation(int loc_id) {
		locationRepo.deleteLocation(loc_id);
		//Company c = companyRepo.getOne(id);
		//companyRepo.delete(c);
		//return "Record has been Deleted";
	}


}
