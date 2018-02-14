package com.example.formulaire.mapper;

import com.example.formulaire.dto.FormulaireDto;
import com.example.formulaire.model.Formulaire;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2018-02-14T20:27:34+0100",
    comments = "version: 1.2.0.Final, compiler: Eclipse JDT (IDE) 3.13.100.v20171123-1049, environment: Java 1.8.0_162 (Oracle Corporation)"
)
@Component
public class FormulaireMapperImpl implements FormulaireMapper {

    @Override
    public FormulaireDto FormulaireToFormulaireDto(Formulaire formulaire) {
        if ( formulaire == null ) {
            return null;
        }

        FormulaireDto formulaireDto = new FormulaireDto();

        formulaireDto.setFirstname( formulaire.getNom() );
        formulaireDto.setPhoneNumber( formulaire.getPhone() );
        formulaireDto.setId_( formulaire.getId() );
        formulaireDto.setAge_( formulaire.getAge() );
        formulaireDto.setEmail_adress( formulaire.getEmail() );
        formulaireDto.setAdress_( formulaire.getAdress() );
        formulaireDto.setLastname( formulaire.getPrenom() );

        return formulaireDto;
    }

    @Override
    public Formulaire FormulaireDtoToFormulaire(FormulaireDto formulaireDto) {
        if ( formulaireDto == null ) {
            return null;
        }

        Formulaire formulaire = new Formulaire();

        formulaire.setPhone( formulaireDto.getPhoneNumber() );
        formulaire.setAdress( formulaireDto.getAdress_() );
        formulaire.setId( formulaireDto.getId_() );
        formulaire.setNom( formulaireDto.getFirstname() );
        formulaire.setPrenom( formulaireDto.getLastname() );
        formulaire.setAge( formulaireDto.getAge_() );
        formulaire.setEmail( formulaireDto.getEmail_adress() );

        return formulaire;
    }
}
