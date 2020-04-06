package com.springboot.mongo.restcrud.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.mongo.restcrud.model.AppUser;

public interface AppUserRepository extends MongoRepository<AppUser, Long> {

}
