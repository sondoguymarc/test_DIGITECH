package com.digitech.test.Repository;

import com.digitech.test.entite.Branche;
import com.digitech.test.entite.Reference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReferenceRepository extends JpaRepository<Reference, Long>  {
}
