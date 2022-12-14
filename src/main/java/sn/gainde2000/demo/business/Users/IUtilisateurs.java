package sn.gainde2000.demo.business.Users;

import sn.gainde2000.demo.business.Users.dtos.UtilisateursGetDto;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursPostDto;
import sn.gainde2000.demo.exceptionHandlers.ResourceNotFoundException;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;
import sn.gainde2000.demo.security.dto.RegistrationRequest;
import sn.gainde2000.demo.security.dto.RegistrationResponse;
import sn.gainde2000.demo.utils.DataResponse;

import java.util.List;

public interface IUtilisateurs {

    public Utilisateurs saveUtilisateur(UtilisateursPostDto utilisateurs);

    // public List<UtilisateursGetDto> listUtilisateurs();
    DataResponse getAllUsers(int pageNo, int pageSize, String sortBy, String sortDir);
    public UtilisateursGetDto getUtilisateur(Long id) throws ResourceNotFoundException;

    void deleteUtilisateur(Utilisateurs utilisateurs);
    // Utilisateurs updateUtilisateur(Long id, Utilisateurs utilisateur);

    Utilisateurs findUtilisateurById(Long id);

   // UtilisateursGetDto getUtilisateur(Long id) throws ResourceNotFoundException;

    RegistrationResponse registration(RegistrationRequest registrationRequest);

    AuthenticatedUserDto findAuthenticatedUtilisateursByUsername(String username);
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       package sn.gainde2000.demo.business.Users;

import sn.gainde2000.demo.business.Users.dtos.UtilisateursGetDto;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursPostDto;
import sn.gainde2000.demo.exceptionHandlers.ResourceNotFoundException;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;
import sn.gainde2000.demo.security.dto.RegistrationRequest;
import sn.gainde2000.demo.security.dto.RegistrationResponse;
import sn.gainde2000.demo.utils.DataResponse;

import java.util.List;

public interface IUtilisateurs {

    public Utilisateurs saveUtilisateur(UtilisateursPostDto utilisateurs);

    // public List<UtilisateursGetDto> listUtilisateurs();
    DataResponse getAllUsers(int pageNo, int pageSize, String sortBy, String sortDir);
    public UtilisateursGetDto getUtilisateur(Long id) throws ResourceNotFoundException;

    void deleteUtilisateur(Utilisateurs utilisateurs);
    // Utilisateurs updateUtilisateur(Long id, Utilisateurs utilisateur);

    Utilisateurs findUtilisateurById(Long id);

   // UtilisateursGetDto getUtilisateur(Long id) throws ResourceNotFoundException;

    RegistrationResponse registration(RegistrationRequest registrationRequest);

    AuthenticatedUserDto findAuthenticatedUtilisateursByUsername(String username);
}
