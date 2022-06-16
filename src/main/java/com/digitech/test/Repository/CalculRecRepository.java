package com.digitech.test.Repository;


import com.digitech.test.entite.CalculatedREC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculRecRepository  extends JpaRepository<CalculatedREC, Long> {

}
