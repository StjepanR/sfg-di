package com.springframework.pets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/28/19.
 */
@Service
@Profile("cat")
public class CatPetService implements PetService {

    @Autowired
    private PetServiceFactory petServiceFactory;

    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
