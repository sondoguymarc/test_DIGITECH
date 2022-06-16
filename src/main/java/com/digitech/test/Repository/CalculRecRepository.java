package com.digitech.test.Repository;


import com.digitech.test.entite.CalculatedREC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "CalculRec" , path = "CalculRec")
public interface CalculRecRepository  extends JpaRepository<CalculatedREC, Long> {

}
