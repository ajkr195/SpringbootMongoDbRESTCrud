package com.springboot.mongo.restcrud.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mongo.restcrud.dao.AppUserRepository;
import com.springboot.mongo.restcrud.model.AppUser;

@Service
public class AppUserServiceImpl implements AppUserService {
	
	@Autowired
	AppUserRepository appUserRepository;
	
	
	@Override
	public void createAppUser(List<AppUser> appuser) {
		// TODO Auto-generated method stub
		appUserRepository.saveAll(appuser);
		
	}

	@Override
	public Collection<AppUser> getAllAppUsers() {
		// TODO Auto-generated method stub
		return appUserRepository.findAll();
	}

	@Override
	public Optional<AppUser> findAppUserById(Long id) {
		// TODO Auto-generated method stub
		return appUserRepository.findById(id);
	}

	@Override
	public void deleteAppUserById(Long id) {
		appUserRepository.deleteById(id);
		
	}

	@Override
	public void updateAppUser(AppUser appuser) {
		// TODO Auto-generated method stub
		appUserRepository.save(appuser);
	}

	@Override
	public void deleteAllAppUsers() {
		// TODO Auto-generated method stub
		appUserRepository.deleteAll();
	}

}
