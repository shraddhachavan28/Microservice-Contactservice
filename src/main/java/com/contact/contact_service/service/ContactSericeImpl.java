package com.contact.contact_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.entity.Contact;
@Service
public class ContactSericeImpl implements ConatctService{

    List<Contact> list = List.of(
        new Contact(1L, "one@gmail.com", "one", 1010L),
        new Contact(2L, "two@gmail.com", "two", 1012L),
        new Contact(3L, "three@gmail.com", "three", 1013L),
        new Contact(4L, "four@gmail.com", "four", 1014L)
    );

    @Override
    public List<Contact> getContactForUserId(Long userId) {
        // TODO Auto-generated method stub
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
    
}