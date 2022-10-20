package cision.com.datastore.poc.service;

import cision.com.datastore.poc.entity.Pet;

public interface PetService {
  Pet create(Pet pet);
  Pet findById(Long id);
}
