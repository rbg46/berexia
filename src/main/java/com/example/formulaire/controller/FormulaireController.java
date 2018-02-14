package com.example.formulaire.controller;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.formulaire.dto.FormulaireDto;
import com.example.formulaire.mapper.FormulaireMapper;
import com.example.formulaire.model.Formulaire;
import com.example.formulaire.services.FormulaireService;






@RestController
public class FormulaireController {

	 // bean defined in com.exemple.formulaire.FormulaireApplication 
	@Autowired
	 FormulaireService  formulaireService;
	
	
	@Autowired
	FormulaireMapper formulaireMapper;
	
	
	@RequestMapping(value = "/formulaire", method = RequestMethod.POST)
	
	public void formulaire(@RequestBody FormulaireDto  formulaireDto ) {
		
	Formulaire formulaire= formulaireMapper.FormulaireDtoToFormulaire(formulaireDto);
	 formulaireService.saveFormulaire(formulaire);
		
		
	}
	
@RequestMapping(value = "/formulaires", method = RequestMethod.GET)
	
	public List<FormulaireDto> formulaires() {
	
	 List<Formulaire> formulaires = formulaireService.getFormulaires();
	 
	 return formulaires.stream()
    .map( formulaire-> formulaireMapper.FormulaireToFormulaireDto(formulaire))
    .collect(Collectors.toList());
}
	
	
}
