package com.digitech.test.Repository;


import com.digitech.test.entite.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Country" , path = "country")
public interface CountryRepository  extends JpaRepository<Country, Long> {
}
