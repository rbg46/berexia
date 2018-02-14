package com.example.formulaire.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.example.formulaire.dto.FormulaireDto;
import com.example.formulaire.model.Formulaire;

@Mapper(componentModel = "spring")  
public interface FormulaireMapper {

	
	@Mappings({
		@Mapping(source = "id", target = "id_"),
		@Mapping(source = "nom", target = "firstname"),
		@Mapping(source = "prenom", target = "lastname"),
		@Mapping(source = "age", target = "age_"),
		@Mapping(source = "email", target = "email_adress"),
		@Mapping(source = "adress", target = "adress_"),
		@Mapping(source = "phone", target = "phoneNumber")
		
		}) FormulaireDto FormulaireToFormulaireDto (Formulaire formulaire);
	
	@Mappings({
		@Mapping(source = "id_", target = "id"),
		@Mapping(source = "firstname", target = "nom"),
		@Mapping(source = "lastname", target = "prenom"),
		@Mapping(source = "age_", target = "age"),
		@Mapping(source = "email_adress", target = "email"),
		@Mapping(source = "adress_", target = "adress"),
		@Mapping(source = "phoneNumber", target = "phone")
		
		}) Formulaire FormulaireDtoToFormulaire (FormulaireDto formulaireDto);
	
}
