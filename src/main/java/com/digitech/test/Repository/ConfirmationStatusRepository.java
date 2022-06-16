package com.digitech.test.Repository;


import com.digitech.test.entite.ConfirmationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Confirmationstatus" , path = "Confirmationstatus")
public interface ConfirmationStatusRepository extends JpaRepository<ConfirmationStatus, Long> {
}
