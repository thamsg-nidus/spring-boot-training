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

import com.opennidus.training.Entity.Company;
import com.opennidus.training.Service.Company_service;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class Company_Controller {
	

	@Autowired
	private Company_service companyService;
	
		@RequestMapping("/companies")
		public List<Company> getAllDetails(){
			return companyService.getAllDetails();
			
		}

		@RequestMapping("/companies/{id}")
		public Optional<Company> getaDetail(@PathVariable(value= "id")int id){
			return companyService.getaDetail(id);
			
		}
		
		@RequestMapping("/companiesbyemail/{email}")
		public Optional<Company> getdetailbyemail(@PathVariable(value= "email")String email){
			return companyService.getdetailbyemail(email);
			
		}

		@RequestMapping(method = RequestMethod.POST, value="/companies/new")
		public Company createCompany(@RequestBody Company company) {
			return companyService.createCompany(company);
		}

		@RequestMapping(method = RequestMethod.PUT, value="/companies/exists")
		public Company updateCompany(@RequestBody Company company) {
			return companyService.updateCompany(company);
		}

		@RequestMapping(method = RequestMethod.DELETE, value = "/companies/{id}")
		public void deleteCompany(@PathVariable(value= "id")int id){
			companyService.deleteCompany(id);
			
		}
		

}
