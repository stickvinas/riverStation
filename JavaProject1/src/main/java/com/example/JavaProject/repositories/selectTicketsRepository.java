package com.example.JavaProject.repositories;

import com.example.JavaProject.repositories.models.myTickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface selectTicketsRepository extends JpaRepository<myTickets, Integer> {
}
