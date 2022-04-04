package com.altabanol.springbootdevicesellerapplication.service;

import com.altabanol.springbootdevicesellerapplication.model.User;

public interface AuthenticationService
{
    User signInAndReturnJWT(User signInRequest);
}

