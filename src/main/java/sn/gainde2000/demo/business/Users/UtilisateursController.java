package sn.gainde2000.demo.business.Users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursGetDto;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursPostDto;
import sn.gainde2000.demo.exceptionHandlers.ResourceNotFoundException;
import sn.gainde2000.demo.utils.AppConstants;
import sn.gainde2000.demo.utils.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/utilisateurs")
public class UtilisateursController {
    static final Logger logger = LoggerFactory.getLogger(UtilisateursController.class);

    private final IUtilisateurs iUtilisateurs;

    private PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    public UtilisateursController(IUtilisateurs iUtilisateurs) {
        this.iUtilisateurs = iUtilisateurs;
    }

    @PostMapping("/create")
    public ResponseEntity<Void> saveUtilisateurs(@RequestBody UtilisateursPostDto utilisateursPostDto) {
        utilisateursPostDto.setPassword(encoder().encode(utilisateursPostDto.getPassword()));
        logger.info("Controller: saved user ", utilisateursPostDto);
        iUtilisateurs.saveUtilisateur(utilisateursPostDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<DataResponse> checkUsersPageables(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,package sn.gainde2000.demo.business.Users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursGetDto;
import sn.gainde2000.demo.business.Users.dtos.UtilisateursPostDto;
import sn.gainde2000.demo.exceptionHandlers.ResourceNotFoundException;
import sn.gainde2000.demo.utils.AppConstants;
import sn.gainde2000.demo.utils.DataResponse;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/utilisateurs")
public class UtilisateursController {
    static final Logger logger = LoggerFactory.getLogger(UtilisateursController.class);

    private final IUtilisateurs iUtilisateurs;

    private PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }

    public UtilisateursController(IUtilisateurs iUtilisateurs) {
        this.iUtilisateurs = iUtilisateurs;
    }

    @PostMapping("/create")
    public ResponseEntity<Void> saveUtilisateurs(@RequestBody UtilisateursPostDto utilisateursPostDto) {
        utilisateursPostDto.setPassword(encoder().encode(utilisateursPostDto.getPassword()));
        logger.info("Controller: saved user ", utilisateursPostDto);
        iUtilisateurs.saveUtilisateur(utilisateursPostDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<DataResponse> checkUsersPageables(
            @RequestParam(value = "pageNo", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER, required = false) int pageNo,
            @RequestParam(value = "pageSize", defaultValue = AppConstants.DEFAULT_PAGE_SIZE, required = false) int pageSize,
            @RequestParam(value = "sortBy", defaultValue = AppConstants.DEFAULT_SORT_BY, required = false) String sortBy,
            @RequestParam(value = "sortDir", defaultValue = AppConstants.DEFAULT_SORT_DIRECTION, required = false) String sortDir) {
        logger.info("loading all users in response.....");
        return ResponseEntity.ok(iUtilisateurs.getAllUsers(pageNo, pageSize, sortBy, sortDir));
    }

    @GetMapping("/getUtilisateur/{id}")
    public ResponseEntity<UtilisateursGetDto> getUtilisateursById(@PathVariable("id") Long id)
            throws ResourceNotFoundException {
        UtilisateursGetDto utilisateursDto = iUtilisateurs.getUtilisateur(id);
        return ResponseEntity.ok().body(utilisateursDto);
    }

    @PostMapping("/delete")
    public ResponseEntity<Void> deleteUtilisateur(@RequestBody Utilisateurs utilisateursPostDto) {
        iUtilisateurs.deleteUtilisateur(utilisateursPostDto);
        return new ResponseEntity<>(HttpStatus.OK);

    }

   /* @PostMapping("/{id}")
    public ResponseEntity<Utilisateurs> updateUtilisateur(@PathVariable Long id, @RequestBody UtilisateursPostDto users) {
        Utilisateurs user = this.utilisateursRepository.findUtilisateurById(id);
        user.setPrenom(users.getPrenom());
        user.setNom(users.getNom());
        user.setEmail(users.getEmail());
        user.setTelephone(users.getTelephone());
        iUtilisateurs.saveUtilisateur(user);
        return new ResponseEntity<Utilisateurs>(HttpStatus.CREATED);

    }*/

}
