package com.aliseylaneh.ascpetclinic.bootstrap;

import com.aliseylaneh.ascpetclinic.model.Owner;
import com.aliseylaneh.ascpetclinic.model.PetType;
import com.aliseylaneh.ascpetclinic.model.Vet;
import com.aliseylaneh.ascpetclinic.services.OwnerService;
import com.aliseylaneh.ascpetclinic.services.PetTypeService;
import com.aliseylaneh.ascpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);
        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Ali");
        owner1.setLastName("Seylaneh");
        Owner owner2 = new Owner();
        owner2.setFirstName("Jake");
        owner2.setLastName("Thompson");
        Owner owner3 = new Owner();
        owner3.setFirstName("Robert");
        owner3.setLastName("Johnson");
        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);
        System.out.println("Loaded Owners...");
        Vet vet1 = new Vet();
        vet1.setFirstName("Chris");
        vet1.setLastName("Evans");
        Vet vet2 = new Vet();
        vet2.setFirstName("Mohammad");
        vet2.setLastName("Seylaneh");
        Vet vet3 = new Vet();
        vet3.setFirstName("Chrissy");
        vet3.setLastName("Costanza");
        vetService.save(vet1);
        vetService.save(vet2);
        vetService.save(vet3);
        System.out.println("Loaded Vets...");
    }
}
