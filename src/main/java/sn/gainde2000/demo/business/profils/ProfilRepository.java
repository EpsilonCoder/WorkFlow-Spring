package sn.gainde2000.demo.business.profils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource
public interface ProfilRepository extends JpaRepository<Profil, Long> {
    Profil findProfilByNomProfil(String nomProfil);
}
                                                                                                                                                                                                                                                package sn.gainde2000.demo.business.profils;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestResource
public interface ProfilRepository extends JpaRepository<Profil, Long> {
    Profil findProfilByNomProfil(String nomProfil);
}
