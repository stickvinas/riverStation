package com.example.JavaProject.repositories;

import com.example.JavaProject.repositories.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cruisesRepository extends JpaRepository <Cruises, String> {
}
