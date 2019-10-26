package com.aliseylaneh.ascpetclinic.bootstrap;

import com.aliseylaneh.ascpetclinic.model.Owner;
import com.aliseylaneh.ascpetclinic.model.Vet;
import com.aliseylaneh.ascpetclinic.services.OwnerService;
import com.aliseylaneh.ascpetclinic.services.VetService;
import com.aliseylaneh.ascpetclinic.services.map.OwnerMapService;
import com.aliseylaneh.ascpetclinic.services.map.VetMapService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerMapService();
        this.vetService = new VetMapService();
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Ali");
        owner1.setLastName("Seylaneh");
        owner1.setId(1L);
        Owner owner2 = new Owner();
        owner2.setFirstName("Jake");
        owner2.setLastName("Thompson");
        owner2.setId(2L);
        Owner owner3 = new Owner();
        owner3.setFirstName("Robert");
        owner3.setLastName("Johnson");
        owner3.setId(3L);
        ownerService.save(owner1);
        ownerService.save(owner2);
        ownerService.save(owner3);
        System.out.println("Loaded Owners...");
        Vet vet1 = new Vet();
        vet1.setFirstName("Chris");
        vet1.setLastName("Evans");
        vet1.setId(1L);
        Vet vet2 = new Vet();
        vet2.setFirstName("Mohammad");
        vet2.setLastName("Seylaneh");
        vet2.setId(2L);
        Vet vet3 = new Vet();
        vet3.setFirstName("Chrissy");
        vet3.setLastName("Costanza");
        vet3.setId(3L);
        vetService.save(vet1);
        vetService.save(vet2);
        vetService.save(vet3);
        System.out.println("Loaded Vets...");
    }
}
