package com.digitech.test.Repository;


import com.digitech.test.entite.Branche;
import com.digitech.test.entite.PublicationDate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationDateRepository extends JpaRepository<PublicationDate, Long> {
}
