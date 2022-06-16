package com.digitech.test.Repository;


import com.digitech.test.entite.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
