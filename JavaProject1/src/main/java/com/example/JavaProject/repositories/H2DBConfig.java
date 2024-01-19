//package com.example.JavaProject.repositories;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.stereotype.Repository;
//
//
//@Configuration
//    @Repository
//    @EnableJpaRepositories("com.example.JavaProject.repositories")
//    @EntityScan("com.example.JavaProject.repositories.models")
//    public class H2DBConfig {
//        @Bean
//        public EntityManagerFactory entityManagerFactory() {
//            // Configure and create the EntityManagerFactory
//            LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//            // Configure other necessary properties such as data source, packages to scan, etc.
//            return emf.getObject();
//        }
//    }