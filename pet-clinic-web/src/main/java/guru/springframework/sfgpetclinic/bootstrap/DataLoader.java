package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

// or DataInitializer by convention
// This is a Spring Boot specific way to make it!
@Component
public class DataLoader implements CommandLineRunner {

//    // see bellow refactor of it!!!
//    private final OwnerService ownerService;
//    private final VetService vetService;
//
//    // TODO instead of new ... refactor and switch over to use dependency injection!
//    DataLoader() {
//        ownerService = new OwnerServiceMap();
//        vetService = new VetServiceMap();
//    }

    private final OwnerService ownerService;
    private final VetService vetService;

    // @Autowired <-- in older version required (obligatory / mandatory) but now newer version it is not needed!
    DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        // owner1.setId(1L);
        owner1.setFirstName("Chad");
        owner1.setLastName("Hunter");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        // owner2.setId(2L);
        owner2.setFirstName("Gareth");
        owner2.setLastName("Jones");

        ownerService.save(owner2);

        System.out.println("Loaded Owners ...");

        Vet vet1 = new Vet();
        // vet1.setId(1L);
        vet1.setFirstName("Joey");
        vet1.setLastName("Foxworth");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        // vet2.setId(2L);
        vet2.setFirstName("Mary");
        vet2.setLastName("Weatherwax");

        vetService.save(vet2);

        System.out.println("Loaded Vets ...");
    }
}
