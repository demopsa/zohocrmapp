package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {
	/* Without interface we can use class only but  whenever you create an object
	 you should create like this private ContactService contactRepo; means don't interface object*/
    @Autowired
	private ContactRepository contactRepo;
	@Override
	public void saveContact(Contact contact) {
		contactRepo.save(contact);
	}
	@Override
	public List<Contact> getAllContactss() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
		
	}
	@Override
	public Contact getContactByid(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}
	

}
