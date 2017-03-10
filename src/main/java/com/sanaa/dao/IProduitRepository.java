package com.sanaa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanaa.entity.Produit;

public interface IProduitRepository extends JpaRepository<Produit, Long> {

}
