package sn.gainde2000.demo.security.services;


import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.business.Users.IUtilisateurs;
import sn.gainde2000.demo.business.profils.Profil;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;

import java.util.Collections;
import java.util.Objects;


@Service
public class UserDetailsServiceImpl implementpackage sn.gainde2000.demo.security.services;


import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.business.Users.IUtilisateurs;
import sn.gainde2000.demo.business.profils.Profil;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;

import java.util.Collections;
import java.util.Objects;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private static final String USERNAME_OR_PASSWORD_INVALID = "Invalid username or password.";

    private final IUtilisateurs userService;

    public UserDetailsServiceImpl(IUtilisateurs userService) {
        this.userService = userService;
    }


    @Override
    public UserDetails loadUserByUsername(String username) {

        final AuthenticatedUserDto authenticatedUser = userService.findAuthenticatedUtilisateursByUsername(username);

        if (Objects.isNull(authenticatedUser)) {
            throw new UsernameNotFoundException(USERNAME_OR_PASSWORD_INVALID);
        }

        final String authenticatedUsername = authenticatedUser.getUsername();
        final String authenticatedPassword = authenticatedUser.getPassword();
        final Profil userRole = authenticatedUser.getProfil();
        final SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(userRole.getNomProfil());

        return new User(authenticatedUsername, authenticatedPassword, Collections.singletonList(grantedAuthority));
    }
}
