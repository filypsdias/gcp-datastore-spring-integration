package cision.com.datastore.poc.repository;

import cision.com.datastore.poc.entity.User;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface UserRepository extends DatastoreRepository<User, Long> {
}
