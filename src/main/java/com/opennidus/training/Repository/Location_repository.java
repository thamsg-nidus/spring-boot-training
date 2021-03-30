package com.opennidus.training.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.opennidus.training.Entity.Location;

@Repository
public interface Location_repository extends JpaRepository <Location, Integer>{

    @Transactional
    @Modifying
    @Query(value = "update Location set isdeletedflag = true where loc_id = :loc_id", nativeQuery = true)
    void deleteLocation(@Param("loc_id") int loc_id);
    
    @Query(value="select t.* from Location t where isdeletedflag = false", nativeQuery = true)
    List<Location> getAllLocations();

}
