package com.digitech.test.Repository;


import com.digitech.test.entite.Cedants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Cedants" , path = "cedants")
public interface CedantsRepository extends JpaRepository<Cedants, Long> {
}
