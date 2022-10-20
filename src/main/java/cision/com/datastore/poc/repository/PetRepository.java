package cision.com.datastore.poc.repository;

import cision.com.datastore.poc.entity.Pet;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface PetRepository extends DatastoreRepository<Pet, Long> {
}
