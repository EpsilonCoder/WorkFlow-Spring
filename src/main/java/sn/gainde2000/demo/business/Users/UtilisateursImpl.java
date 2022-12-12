package sn.gainde2000.demo.business.Users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.business.Users.dtos.IUtilisateurMappers;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursGetDto;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursPostDto;
import sn.gainde2000.demo.business.profils.ProfilRepository;
import sn.gainde2000.demo.exceptionHandlers.ResourceNotFoundException;
import sn.gainde2000.demo.utils.DataResponse;
import sn.gainde2000.demo.utils.GeneralMessageAccessor;

import java.util.List;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;
import sn.gainde2000.demo.security.dto.RegistrationRequest;
import sn.gainde2000.demo.security.dto.RegistrationResponse;
import sn.gainde2000.demo.security.mappers.AuthUserMapper;

@Service
public class UtilisateursImpl implements IUtilisateurs {

    static final Logger log = LoggerFactory.getLogger(UtilisateursImpl.class);

    private final UtilisateursRepository utilisateursRepository;
    private final IUtilisateurMappers mappers;

    private static final String REGISTRATION_SUCCESSFUL = "registration_successful";

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final UtilisateursValidationService userValidationService;

    private final GeneralMessageAccessor generalMessageAccessor;
    private final ProfilRepository profilRepository;

    public UtilisateursImpl(UtilisateursRepository utilisateursRepository, IUtilisateurMappers mappers,
            BCryptPasswordEncoder bCryptPasswordEncoder, UtilisateursValidationService userValidationService,
            GeneralMessageAccessor generalMessageAccessor, ProfilRepository profilRepository) {
        this.utilisateursRepository = utilisateursRepository;
        this.mappers = mappers;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userValidationService = userValidationService;
        this.generalMessageAccessor = generalMessageAccessor;
        this.profilRepository = profilRepository;
    }

    @Override
    public Utilisateurs saveUtilisateur(UtilisateursPostDto utilisateurs) {
        return this.utilisateursRepository.save(mappers.utilisateursPostDtoToUtilisateurs(utilisateurs));
        // return mappers.utilisateursPostDtoToUtilisateurs();
    }

    @Override
    public DataResponse getAllUsers(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        Page<Utilisateurs> utilisateurs = utilisateursRepository.findAll(pageable);
        List<Utilisateurs> listOfUsers = utilisateurs.getContent();
        List<UtilisateursGetDto> listUsersGetDtos = mappers.toUtilisateursGetDtos(listOfUsers);
        DataResponse dataResponse = new DataResponse();
        dataResponse.setContent(listUsersGetDtos);
        dataResponse.setPageNo(utilisateurs.getNumber());
        dataResponse.setPageSize(utilisateurs.getpackage sn.gainde2000.demo.business.Users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.business.Users.dtos.IUtilisateurMappers;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursGetDto;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursPostDto;
import sn.gainde2000.demo.business.profils.ProfilRepository;
import sn.gainde2000.demo.exceptionHandlers.ResourceNotFoundException;
import sn.gainde2000.demo.utils.DataResponse;
import sn.gainde2000.demo.utils.GeneralMessageAccessor;

import java.util.List;
import sn.gainde2000.demo.security.dto.AuthenticatedUserDto;
import sn.gainde2000.demo.security.dto.RegistrationRequest;
import sn.gainde2000.demo.security.dto.RegistrationResponse;
import sn.gainde2000.demo.security.mappers.AuthUserMapper;

@Service
public class UtilisateursImpl implements IUtilisateurs {

    static final Logger log = LoggerFactory.getLogger(UtilisateursImpl.class);

    private final UtilisateursRepository utilisateursRepository;
    private final IUtilisateurMappers mappers;

    private static final String REGISTRATION_SUCCESSFUL = "registration_successful";

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final UtilisateursValidationService userValidationService;

    private final GeneralMessageAccessor generalMessageAccessor;
    private final ProfilRepository profilRepository;

    public UtilisateursImpl(UtilisateursRepository utilisateursRepository, IUtilisateurMappers mappers,
            BCryptPasswordEncoder bCryptPasswordEncoder, UtilisateursValidationService userValidationService,
            GeneralMessageAccessor generalMessageAccessor, ProfilRepository profilRepository) {
        this.utilisateursRepository = utilisateursRepository;
        this.mappers = mappers;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userValidationService = userValidationService;
        this.generalMessageAccessor = generalMessageAccessor;
        this.profilRepository = profilRepository;
    }

    @Override
    public Utilisateurs saveUtilisateur(UtilisateursPostDto utilisateurs) {
        return this.utilisateursRepository.save(mappers.utilisateursPostDtoToUtilisateurs(utilisateurs));
        // return mappers.utilisateursPostDtoToUtilisateurs();
    }

    @Override
    public DataResponse getAllUsers(int pageNo, int pageSize, String sortBy, String sortDir) {
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
                : Sort.by(sortBy).descending();
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);

        Page<Utilisateurs> utilisateurs = utilisateursRepository.findAll(pageable);
        List<Utilisateurs> listOfUsers = utilisateurs.getContent();
        List<UtilisateursGetDto> listUsersGetDtos = mappers.toUtilisateursGetDtos(listOfUsers);
        DataResponse dataResponse = new DataResponse();
        dataResponse.setContent(listUsersGetDtos);
        dataResponse.setPageNo(utilisateurs.getNumber());
        dataResponse.setPageSize(utilisateurs.getSize());
        dataResponse.setTotalElements(utilisateurs.getTotalElements());
        dataResponse.setTotalPages(utilisateurs.getTotalPages());
        dataResponse.setLast(utilisateurs.isLast());

        return dataResponse;
    }

    @Override
    public UtilisateursGetDto getUtilisateur(Long id) throws ResourceNotFoundException {
        Utilisateurs user = this.utilisateursRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                "Utilisateur not found for this id :: " + id));
        log.error("User not exist with id ", id);

        return mappers.toUtilisateurGetDto(user);
    }

    @Override
    public void deleteUtilisateur(Utilisateurs utilisateurs) {
        utilisateursRepository.delete(utilisateurs);
    }

    /*  @Override
    public Utilisateurs updateUtilisateur(Long id, Utilisateurs utilisateur) {
        Utilisateurs user = this.utilisateursRepository.findUtilisateurById(id);
        user.setPrenom(utilisateur.getPrenom());
        user.setNom(utilisateur.getNom());
        user.setEmail(utilisateur.getEmail());
        user.setTelephone(utilisateur.getTelephone());
        return this.utilisateursRepository.save(user);

    }*/
    @Override
    public Utilisateurs findUtilisateurById(Long id) {
        return utilisateursRepository.findUtilisateurById(id);

    }

    public RegistrationResponse registration(RegistrationRequest registrationRequest) {
        userValidationService.validateUser(registrationRequest);

        final Utilisateurs user = AuthUserMapper.INSTANCE.convertToUtilisateurs(registrationRequest);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setProfil(profilRepository.findProfilByNomProfil("USER"));

        utilisateursRepository.save(user);

        final String username = registrationRequest.getUsername();
        final String registrationSuccessMessage = generalMessageAccessor.getMessage(null, REGISTRATION_SUCCESSFUL,
                username);

        log.info("{} registered successfully!", username);

        return new RegistrationResponse(registrationSuccessMessage);
    }

    @Override
    public AuthenticatedUserDto findAuthenticatedUtilisateursByUsername(String username) {
        final Utilisateurs user = utilisateursRepository.findUtilisateursByUsername(username);

        return AuthUserMapper.INSTANCE.convertToAuthenticatedUserDto(user);
    }

}
