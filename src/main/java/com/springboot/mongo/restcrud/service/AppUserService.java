package com.springboot.mongo.restcrud.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.springboot.mongo.restcrud.model.AppUser;

public interface AppUserService {

	public void createAppUser(List<AppUser> appuser);
	public Collection<AppUser> getAllAppUsers();
	public Optional<AppUser> findAppUserById(Long id);
	public void deleteAppUserById(Long id);
	public void updateAppUser(AppUser appuser);
	public void deleteAllAppUsers();
	
}