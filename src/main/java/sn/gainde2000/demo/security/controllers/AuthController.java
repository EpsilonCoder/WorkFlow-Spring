package sn.gainde2000.demo.security.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.gainde2000.demo.business.Users.IUtilisateurs;
import sn.gainde2000.demo.security.dto.LoginRequest;
import sn.gainde2000.demo.security.dto.LoginResponse;
import sn.gainde2000.demo.security.dto.RegistrationRequest;
import sn.gainde2000.demo.security.dto.RegistrationResponse;
import sn.gainde2000.demo.security.jwt.JwtTokenService;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtTokenService jwtTokenService;
    private final IUtilisateurs iUtilisateurs;

    public AuthController(JwtTokenService jwtTokenService, IUtilisateurs ipackage sn.gainde2000.demo.security.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.gainde2000.demo.business.Users.IUtilisateurs;
import sn.gainde2000.demo.security.dto.LoginRequest;
import sn.gainde2000.demo.security.dto.LoginResponse;
import sn.gainde2000.demo.security.dto.RegistrationRequest;
import sn.gainde2000.demo.security.dto.RegistrationResponse;
import sn.gainde2000.demo.security.jwt.JwtTokenService;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtTokenService jwtTokenService;
    private final IUtilisateurs iUtilisateurs;

    public AuthController(JwtTokenService jwtTokenService, IUtilisateurs iUtilisateurs) {
        this.jwtTokenService = jwtTokenService;
        this.iUtilisateurs = iUtilisateurs;
    }

    //For testing auth
    @PostMapping("login")
    public ResponseEntity<LoginResponse> loginRequest(@Valid @RequestBody LoginRequest loginRequest) {

        final LoginResponse loginResponse = jwtTokenService.getLoginResponse(loginRequest);

        return ResponseEntity.ok(loginResponse);
    }

    //for registration

    @PostMapping("register")
    public ResponseEntity<RegistrationResponse> registrationRequest(@Valid @RequestBody RegistrationRequest registrationRequest) {

        final RegistrationResponse registrationResponse = iUtilisateurs.registration(registrationRequest);

        return ResponseEntity.status(HttpStatus.CREATED).body(registrationResponse);
    }
}
