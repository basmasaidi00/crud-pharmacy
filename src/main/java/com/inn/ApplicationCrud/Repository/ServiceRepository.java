package com.inn.ApplicationCrud.Repository;
import com.inn.ApplicationCrud.Entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Long> {
}
