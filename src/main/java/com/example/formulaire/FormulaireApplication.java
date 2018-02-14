package com.example.formulaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.formulaire.model.Formulaire;
import com.example.formulaire.services.FormulaireService;
import com.example.formulaire.services.imp.FormulaireServiceImp;

@SpringBootApplication
public class FormulaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormulaireApplication.class, args);
	}
	
	
	@Bean
    public FormulaireService  formulaireServiceImp () {
        return new FormulaireServiceImp ();
    }
}
