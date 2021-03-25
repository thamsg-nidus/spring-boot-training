package com.opennidus.training.CompanyDetails;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface Company_repository extends JpaRepository<Company, Integer>
{
    @Query(value = "select t.* from Companydata t where t.email = :email", nativeQuery = true)
	Optional<Company> getdetailbyemail(@Param("email") String email);
    
    @Transactional
    @Modifying
    @Query(value = "update Companydata set isdeletedflag = 1 where id = :id", nativeQuery = true)
    void deleteCompany(@Param("id") int id);
    
    @Query(value="select t.* from companydata t where isdeletedflag = 0 order by company_name", nativeQuery = true)
    List<Company> getAllCompany();
}
