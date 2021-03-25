package com.opennidus.training.CompanyDetails;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Company_service {

	@Autowired
	private Company_repository companyRepo;
	
	
	public List<Company> getAllDetails() {
		//return companyRepo.findAll();
		return companyRepo.getAllCompany();
	}
    
	public Optional<Company> getaDetail(int id){
		return companyRepo.findById(id);
				
	}

	public Company createCompany(Company company) {
		return companyRepo.save(company);
	}

	public Company updateCompany(Company company) {
		return companyRepo.save(company);
	}

	void deleteCompany(int id) {
		companyRepo.deleteCompany(id);
		//Company c = companyRepo.getOne(id);
		//companyRepo.delete(c);
		//return "Record has been Deleted";
	}

	public Optional<Company> getdetailbyemail(String email) {
		return companyRepo.getdetailbyemail(email);
	}

}
