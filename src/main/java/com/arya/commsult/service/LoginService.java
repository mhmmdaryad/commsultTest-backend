package com.arya.commsult.service;

import com.arya.commsult.common.APIResponse;
import com.arya.commsult.model.User;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    public APIResponse login(User user);
}
