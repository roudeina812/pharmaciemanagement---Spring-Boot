package com.example.produitpharmaceutique.Repositories;

import com.example.produitpharmaceutique.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {
}