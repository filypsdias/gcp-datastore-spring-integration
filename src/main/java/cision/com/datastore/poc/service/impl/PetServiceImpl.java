package cision.com.datastore.poc.service.impl;

import cision.com.datastore.poc.entity.Pet;
import cision.com.datastore.poc.repository.PetRepository;
import cision.com.datastore.poc.service.PetService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

  private final PetRepository repository;

  @Override
  @Transactional
  public Pet create(final Pet pet) {
    return repository.save(pet);
  }

  @Override
  @Transactional
  public Pet findById(final Long id) {
    Optional<Pet> petFound = repository.findById(id);
    return petFound.orElse(null);

  }

}
