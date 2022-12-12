package sn.gainde2000.demo.business.Users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.exceptionHandlers.RegistrationException;
import sn.gainde2000.demo.security.dto.RegistrationRequest;
import sn.gainde2000.demo.utils.ExceptionMessageAccessor;

@Service
public class UtilisateursValidationService {
    statipackage sn.gainde2000.demo.business.Users;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.exceptionHandlers.RegistrationException;
import sn.gainde2000.demo.security.dto.RegistrationRequest;
import sn.gainde2000.demo.utils.ExceptionMessageAccessor;

@Service
public class UtilisateursValidationService {
    static final Logger log = LoggerFactory.getLogger(UtilisateursValidationService.class);

    private static final String EMAIL_ALREADY_EXISTS = "email_already_exists";

    private static final String USERNAME_ALREADY_EXISTS = "username_already_exists";

    private final UtilisateursRepository userRepository;

    private final ExceptionMessageAccessor exceptionMessageAccessor;


    public UtilisateursValidationService(UtilisateursRepository userRepository, ExceptionMessageAccessor exceptionMessageAccessor) {
        this.userRepository = userRepository;
        this.exceptionMessageAccessor = exceptionMessageAccessor;
    }

    public void validateUser(RegistrationRequest registrationRequest) {

        final String email = registrationRequest.getEmail();
        final String username = registrationRequest.getUsername();

        checkEmail(email);
        checkUsername(username);
    }

    private void checkUsername(String username) {

        final boolean existsByUsername = userRepository.existsByUsername(username);

        if (existsByUsername) {

            log.warn("{} is already being used!", username);

            final String existsUsername = exceptionMessageAccessor.getMessage(null, USERNAME_ALREADY_EXISTS);
            throw new RegistrationException(existsUsername);
        }

    }

    private void checkEmail(String email) {

        final boolean existsByEmail = userRepository.existsByEmail(email);

        if (existsByEmail) {

            log.warn("{} is already being used!", email);

            final String existsEmail = exceptionMessageAccessor.getMessage(null, EMAIL_ALREADY_EXISTS);
            throw new RegistrationException(existsEmail);
        }
    }
}
