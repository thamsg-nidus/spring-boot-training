package com.opennidus.training.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.opennidus.training.Entity.Location;
import com.opennidus.training.Service.Location_service;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class Location_Controller {

	@Autowired
	private Location_service locationService;

	@RequestMapping("/locations")
	public List<Location> getAllLocations(){
		return locationService.getAllLocations();
		
	}

	@RequestMapping("/locations/{id}")
	public Optional<Location> getaLocation(@PathVariable(value= "loc_id")int loc_id){
		return locationService.getaLocation(loc_id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/locations/new")
	public Location createLocation(@RequestBody Location location) {
		return locationService.createLocation(location);
	}

	@RequestMapping(method = RequestMethod.PUT, value="/locations/exists")
	public Location updateLocation(@RequestBody Location location) {
		return locationService.updateLocation(location);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/locations/{id}")
	public void deleteLocation(@PathVariable(value= "loc_id")int loc_id){
		locationService.deleteLocation(loc_id);
		
	}


}
