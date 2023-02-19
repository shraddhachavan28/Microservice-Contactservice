package com.contact.contact_service.service;

import java.util.List;

import com.contact.contact_service.entity.Contact;

public interface ConatctService {
    public List<Contact> getContactForUserId(Long userID);
}