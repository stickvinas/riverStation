package com.example.JavaProject.repositories;

import com.example.JavaProject.repositories.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<Users, Integer> {
}
