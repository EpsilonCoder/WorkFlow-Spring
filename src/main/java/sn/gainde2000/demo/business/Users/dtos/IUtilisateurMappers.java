package sn.gainde2000.demo.business.Users.dtos;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sn.gainde2000.demo.business.Users.Utilisateurs;
import sn.gainde2000.demo.business.profils.Profil;
import sn.gainde2000.demo.business.profils.dtos.ProfilGetDto;
import sn.gainde2000.demo.business.profils.dtos.ProfilPostDto;

import java.util.List;

@Mapper(componentModel = "package sn.gainde2000.demo.business.Users.dtos;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import sn.gainde2000.demo.business.Users.Utilisateurs;
import sn.gainde2000.demo.business.profils.Profil;
import sn.gainde2000.demo.business.profils.dtos.ProfilGetDto;
import sn.gainde2000.demo.business.profils.dtos.ProfilPostDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUtilisateurMappers {
    Utilisateurs utilisateursPostDtoToUtilisateurs(UtilisateursPostDto utilisateursPostDto);

    List<UtilisateursGetDto> toUtilisateursGetDtos(List<Utilisateurs> utilisateurs);

    UtilisateursGetDto toUtilisateurGetDto(Utilisateurs utilisateurs);

    Profil profilPostDtoToProfil(ProfilPostDto profilPostDto);

    ProfilGetDto profilToProfilGetDto(Profil profil);

    // For Authentication

}
