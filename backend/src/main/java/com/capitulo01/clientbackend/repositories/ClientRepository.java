package com.capitulo01.clientbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capitulo01.clientbackend.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
