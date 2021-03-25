package com.opennidus.training.CompanyDetails;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class Company_Controller {
	

	@Autowired
	private Company_service companyService;
	
		@RequestMapping("/Companies")
		public List<Company> getAllDetails(){
			return companyService.getAllDetails();
			
		}

		@RequestMapping("/Companies/{id}")
		public Optional<Company> getaDetail(@PathVariable(value= "id")int id){
			return companyService.getaDetail(id);
			
		}
		
		@RequestMapping("/Companiesbyemail/{email}")
		public Optional<Company> getdetailbyemail(@PathVariable(value= "email")String email){
			return companyService.getdetailbyemail(email);
			
		}

		@RequestMapping(method = RequestMethod.POST, value="/Companies/new")
		public Company createCompany(@RequestBody Company company) {
			return companyService.createCompany(company);
		}

		@RequestMapping(method = RequestMethod.PUT, value="/Companies/exists")
		public Company updateCompany(@RequestBody Company company) {
			return companyService.updateCompany(company);
		}

		@RequestMapping(method = RequestMethod.DELETE, value = "/Companies/{id}")
		public void deleteCompany(@PathVariable(value= "id")int id){
			companyService.deleteCompany(id);
			
		}
		

}
