package com.digitech.test.Repository;



import com.digitech.test.entite.ValidationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidationStatusRepository extends JpaRepository<ValidationStatus, Long>  {
}
