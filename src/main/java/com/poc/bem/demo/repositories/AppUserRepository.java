package com.poc.bem.demo.repositories;

import com.poc.bem.demo.domain.AppUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Bootstraps the CRUD operations on the AppUser table.
 */
@Repository
public interface AppUserRepository extends MongoRepository<AppUser, String> {
}
