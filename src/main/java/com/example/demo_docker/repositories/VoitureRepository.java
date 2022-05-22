package com.example.demo_docker.repositories;

import com.example.demo_docker.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture,Long> {
}
