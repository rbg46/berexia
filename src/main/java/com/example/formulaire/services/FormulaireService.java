package com.example.formulaire.services;

import java.util.List;

import com.example.formulaire.dto.FormulaireDto;
import com.example.formulaire.model.Formulaire;

public interface FormulaireService {
	

	public void saveFormulaire(Formulaire formulaire);
	
	public List<Formulaire> getFormulaires();
	
	
	
	

}
