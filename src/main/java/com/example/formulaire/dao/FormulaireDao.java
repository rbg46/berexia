package com.example.formulaire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.formulaire.model.Formulaire;

public interface FormulaireDao extends JpaRepository<Formulaire,Integer> {

}
