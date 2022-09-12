package com.arya.commsult.service;

import com.arya.commsult.common.APIResponse;
import com.arya.commsult.model.User;
import com.arya.commsult.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public APIResponse login(User user) {
        APIResponse apiResponse = new APIResponse();
        //validation

        //verify user exist
        User userLogin = userRepository.getOneByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (userLogin == null) {
            apiResponse.setData("User Login Failed");
            apiResponse.setError("401");
            return apiResponse;
        }

        apiResponse.setData(userLogin.getUsername());
        //response

        return apiResponse;
    }
}
