package com.techeazy.StudentSubjectManagement.controller;

import com.techeazy.StudentSubjectManagement.service.UserService;
import com.techeazy.StudentSubjectManagement.model.AuthenticationRequest;
import com.techeazy.StudentSubjectManagement.model.AuthenticationResponse;
import com.techeazy.StudentSubjectManagement.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserService userService;

    @PostMapping("/authenticate")
    public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {
        try {
            // Authenticate the user
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (Exception e) {
            throw new Exception("Invalid username or password", e);
        }

        // Load user details
        final UserDetails userDetails = userService.loadUserByUsername(authenticationRequest.getUsername());

        // Generate JWT token
        final String jwt = jwtUtil.generateToken(userDetails);

        // Return the response with the JWT token
        return new AuthenticationResponse(jwt);
    }
}
