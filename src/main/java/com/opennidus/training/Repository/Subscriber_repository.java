package com.opennidus.training.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.opennidus.training.Entity.Subscriber;


@Repository
public interface Subscriber_repository extends JpaRepository<Subscriber, Integer> {

    @Query(value = "select t.* from subscriber_details t where t.sub_email = :email", nativeQuery = true)
	Optional<Subscriber> getSubsbyemail(@Param("email") String email);
    
    @Transactional
    @Modifying
    @Query(value = "update subscriber_details set isdeletedflag = true where sub_id = :id", nativeQuery = true)
    void deleteSubscriber(@Param("id") int id);
    
    @Query(value="select t.* from subscriber_details t where isdeletedflag = false order by sub_id desc", nativeQuery = true)
    List<Subscriber> getAllSubscriber();

}
