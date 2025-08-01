package com.example.contactform.repository;

import com.example.contactform.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
    // No need to write any code — Spring will generate all CRUD methods
}
