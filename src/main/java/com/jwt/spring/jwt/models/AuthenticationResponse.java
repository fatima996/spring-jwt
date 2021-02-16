package com.jwt.spring.jwt.models;

import java.io.Serializable;

/**
 * @author Fatima Trtak
 */
public class AuthenticationResponse implements Serializable {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}