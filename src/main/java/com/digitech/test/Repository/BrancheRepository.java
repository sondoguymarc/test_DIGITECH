package com.digitech.test.Repository;

import com.digitech.test.entite.Branche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Branche" , path = "Branche")
public interface BrancheRepository extends JpaRepository<Branche, Long> {
}
