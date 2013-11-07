
package ru.ifmo.springmvc.service;

import java.util.List;
import ru.ifmo.springmvc.domain.Contact;

public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();

    public void removeContact(Integer id);
}
