package com.arya.commsult.security.services;

import org.springframework.stereotype.Service;

@Service
public interface UserDetails {
    String getPassword();

    String getUsername();
}
