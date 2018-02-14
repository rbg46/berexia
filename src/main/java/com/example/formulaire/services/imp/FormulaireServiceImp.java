package com.example.formulaire.services.imp;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.formulaire.dao.FormulaireDao;
import com.example.formulaire.dto.FormulaireDto;
import com.example.formulaire.mapper.FormulaireMapperImpl;
import com.example.formulaire.model.Formulaire;
import com.example.formulaire.services.FormulaireService;

@Repository
public class FormulaireServiceImp implements FormulaireService  {

	@Autowired
	FormulaireDao formulaireDao;
	
	
	

	@Override
	
	public void saveFormulaire(Formulaire formulaire) {
		// TODO Auto-generated method stub
		formulaireDao.save(formulaire);
		
	}
	
	@Override
	public List<Formulaire> getFormulaires() {
		// TODO Auto-generated method stub
	
		return formulaireDao.findAll();
	}

	
	
	

}
