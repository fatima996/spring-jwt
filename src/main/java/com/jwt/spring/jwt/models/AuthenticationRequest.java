package com.jwt.spring.jwt.models;


import lombok.*;

import java.io.Serializable;

/**
 * @author Fatima Trtak
 */
@Data
@RequiredArgsConstructor
public class AuthenticationRequest implements Serializable {
    private String username;
    private String password;
}