package com.digitech.test.Repository;


import com.digitech.test.entite.Branche;
import com.digitech.test.entite.PublicationDate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "publicationDate" , path = "publicationDate")
public interface PublicationDateRepository extends JpaRepository<PublicationDate, Long> {
}
