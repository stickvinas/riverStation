package com.example.JavaProject.repositories;

import com.example.JavaProject.repositories.models.UserLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userLogsRepository extends JpaRepository<UserLogs, Integer> {
}
