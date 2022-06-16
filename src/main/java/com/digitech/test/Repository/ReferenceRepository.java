package com.digitech.test.Repository;

import com.digitech.test.entite.Branche;
import com.digitech.test.entite.Reference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Reference" , path = "Reference")
public interface ReferenceRepository extends JpaRepository<Reference, Long>  {
}
