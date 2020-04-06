package com.springboot.mongo.restcrud.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongo.restcrud.model.AppUser;
import com.springboot.mongo.restcrud.service.AppUserService;

@RestController
@RequestMapping(value= "/api/mongo/appuser")
public class AppUserController {

	@Autowired
	AppUserService appUserService;

	@PostMapping(value= "/create")
	public String create(@RequestBody List<AppUser> emp) {
		System.out.println("Saving appusers.");
		appUserService.createAppUser(emp);
		return "AppUser records created.";
	}

	@GetMapping(value= "/getall")
	public Collection<AppUser> getAll() {
		System.out.println("Getting all appusers.");
		return appUserService.getAllAppUsers();
	}

	@GetMapping(value= "/getbyid/{appuser-id}")
	public Optional<AppUser> getById(@PathVariable(value= "appuser-id") Long id) {
		System.out.println("Getting appuser with appuser-id= {}." + id);
		return appUserService.findAppUserById(id);
	}

	@PutMapping(value= "/update/{appuser-id}")
	public String update(@PathVariable(value= "appuser-id") Long id, @RequestBody AppUser e) {
		System.out.println("Updating appuser with appuser-id= {}." + id);
		e.setId(id);
		appUserService.updateAppUser(e);
		return "AppUser record for appuser-id= " + id + " updated.";
	}

	@DeleteMapping(value= "/delete/{appuser-id}")
	public String delete(@PathVariable(value= "appuser-id") Long id) {
		System.out.println("Deleting appuser with appuser-id= {}."+ id);
		appUserService.deleteAppUserById(id);
		return "AppUser record for appuser-id= " + id + " deleted.";
	}

	@DeleteMapping(value= "/deleteall")
	public String deleteAll() {
		System.out.println("Deleting all appusers.");
		appUserService.deleteAllAppUsers();
		return "All appuser records deleted.";
	}
}