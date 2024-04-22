package com.inn.ApplicationCrud.Repository;



import com.inn.ApplicationCrud.Entity.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
}
