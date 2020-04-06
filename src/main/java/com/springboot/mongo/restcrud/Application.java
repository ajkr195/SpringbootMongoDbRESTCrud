package com.springboot.mongo.restcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.mongo.restcrud.dao.AppUserRepository;
import com.springboot.mongo.restcrud.model.AppUser;

@SpringBootApplication
public class Application  implements CommandLineRunner  {

	@Autowired
	AppUserRepository appUserRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		AppUser appUser = new AppUser();
		appUserRepository.deleteAll();
		appUserRepository.save(new AppUser(1l,"username1","password1","useremail1","userfirstname1","userlastname1","useraddress1"));
		appUserRepository.save(new AppUser(2l,"username2","password2","useremail2","userfirstname2","userlastname2","useraddress2"));
		appUserRepository.save(new AppUser(3l,"username3","password3","useremail3","userfirstname3","userlastname3","useraddress3"));
		appUserRepository.save(new AppUser(4l,"username4","password4","useremail4","userfirstname4","userlastname4","useraddress4"));
		appUserRepository.save(new AppUser(5l,"username5","password5","useremail5","userfirstname5","userlastname5","useraddress5"));
		appUserRepository.save(new AppUser(6l,"username6","password6","useremail6","userfirstname6","userlastname6","useraddress6"));
		appUserRepository.save(new AppUser(7l,"username7","password7","useremail7","userfirstname7","userlastname7","useraddress7"));
		appUserRepository.save(new AppUser(8l,"username8","password8","useremail8","userfirstname8","userlastname8","useraddress8"));
		appUserRepository.save(new AppUser(9l,"username9","password9","useremail9","userfirstname9","userlastname9","useraddress9"));
		
		
	}
}

