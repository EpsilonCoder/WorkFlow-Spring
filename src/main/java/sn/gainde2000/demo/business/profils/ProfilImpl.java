package sn.gainde2000.demo.business.profils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilImpl implements IProfil{
    private final ProfilRepository profilRepository;


    public ProfilImpl(ProfilRepository profilRepository) {
        this.profilRepository = profilRepository;
    }

    @Override
    public Profil saveProfil(Profil profil) {
        return profilRepository.save(profil);
    }

    @Override
    public List<Profil> listPrpackage sn.gainde2000.demo.business.profils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfilImpl implements IProfil{
    private final ProfilRepository profilRepository;


    public ProfilImpl(ProfilRepository profilRepository) {
        this.profilRepository = profilRepository;
    }

    @Override
    public Profil saveProfil(Profil profil) {
        return profilRepository.save(profil);
    }

    @Override
    public List<Profil> listProfils() {
        return profilRepository.findAll();
    }
}
