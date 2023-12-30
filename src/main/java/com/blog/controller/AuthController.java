package com.blog.controller;

import com.blog.entity.Role;
import com.blog.entity.User;
import com.blog.payload.JWTAuthResponse;
import com.blog.payload.LoginDto;
import com.blog.payload.SingUpDto;
import com.blog.repository.RoleRepository;
import com.blog.repository.UserRepository;
import com.blog.security.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenProvider tokenProvider;


    @PostMapping("/signin")
    public ResponseEntity<JWTAuthResponse> authenticateUser(@RequestBody LoginDto loginDto){
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(loginDto.getUserNameOrEmail(), loginDto.getPassword());
        Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
        SecurityContextHolder.getContext().setAuthentication(authenticate);

        // get token form tokenProvider
        String token = tokenProvider.generateToken(authenticate);
        return ResponseEntity.ok(new JWTAuthResponse(token));

    }

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(@RequestBody SingUpDto singUpDto){

        if(userRepository.existsByEmail(singUpDto.getEmail())){
            return new ResponseEntity<>("Email id exists :"+singUpDto.getEmail(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

        if(userRepository.existsByUsername(singUpDto.getUsername())){
            return new ResponseEntity<>("Username exists :"+singUpDto.getUsername(),HttpStatus.INTERNAL_SERVER_ERROR);
        }

        User user = new User();
        user.setName(singUpDto.getName());
        user.setEmail(singUpDto.getEmail());
        user.setUsername(singUpDto.getUsername());
        user.setPassword(passwordEncoder.encode(singUpDto.getPassword()));

        Role roles = roleRepository.findByRoleName("ROLE_ADMIN").get();
        user.setRoles(Collections.singleton(roles));

        User savedUser = userRepository.save(user);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }
}
