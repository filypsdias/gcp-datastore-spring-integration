package cision.com.datastore.poc.controller;

import cision.com.datastore.poc.entity.Pet;
import cision.com.datastore.poc.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PetController {

  private final PetService service;

  @PostMapping(value = "/pets/create")
  public ResponseEntity<Pet> createPet(@RequestBody final Pet pet) {
    service.create(pet);
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .build();
  }

  @GetMapping(value = "/pets/{petId}")
  public ResponseEntity<Pet> findPet(@PathVariable final Long petId) {
    Pet petFound = service.findById(petId);
    return ResponseEntity.ok(petFound);
  }
}
