package com.digitech.test.Repository;


import com.digitech.test.entite.ConfirmationStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfirmationStatusRepository extends JpaRepository<ConfirmationStatus, Long> {
}
