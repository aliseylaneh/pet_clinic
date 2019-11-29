package com.aliseylaneh.ascpetclinic.formatters;

import com.aliseylaneh.ascpetclinic.model.PetType;
import com.aliseylaneh.ascpetclinic.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;

@Component
public class PetTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public PetTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public String print(PetType petType, Locale locale) {
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {

        Collection<PetType> findPetTypes = petTypeService.findAll();

        PetType foundPetType = findPetTypes
                .stream()
                .filter(petType -> petType.getName().equals(text))
                .findFirst()
                .get();

        if (foundPetType != null)
            return foundPetType;
        else
            throw new ParseException("type not found:" + text, 0);
    }
}