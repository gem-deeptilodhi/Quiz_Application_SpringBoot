package com.Spring.Quiz_Application.service;

import com.Spring.Quiz_Application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HostService {
    @Autowired
    private UserRepository userRepository;
}
