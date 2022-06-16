package com.digitech.test.Repository;



import com.digitech.test.entite.ValidationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "validation" , path ="validation")
public interface ValidationStatusRepository extends JpaRepository<ValidationStatus, Long> {
}
