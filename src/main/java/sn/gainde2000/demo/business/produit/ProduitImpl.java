/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit;

import java.util.List;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.business.produit.dtos.IProduitMappers;
import sn.gainde2000.demo.business.produit.dtos.ProduitGetDto;
import sn.gainde2000.demo.business.produit.dtos.ProduitPostDtos;

/**
 *
 * @author asow
 */
@Service
public class ProduitImpl implements IProduit {

    private final ProduitRepository produitRepository;
    private final IProduitMappers produitMappers;

    public ProduitImpl(ProduitRepository produitRepository, IProduitMappers produitMappers) {
        this.produitRepository = produitRepository;
        this.produitMappers = produitMappers;
    }

    @Override
    public Produit saveProduit(ProduitPostDtos produit) {
       return this.produitRepository.save(produitMappers.produitPostDtoToProduit(produit));
    }

    @Override
    public List<ProduitGetDto> listProduit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
                                                                                                                                                                                                                                                                                                                                          /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit;

import java.util.List;
import org.springframework.stereotype.Service;
import sn.gainde2000.demo.business.produit.dtos.IProduitMappers;
import sn.gainde2000.demo.business.produit.dtos.ProduitGetDto;
import sn.gainde2000.demo.business.produit.dtos.ProduitPostDtos;

/**
 *
 * @author asow
 */
@Service
public class ProduitImpl implements IProduit {

    private final ProduitRepository produitRepository;
    private final IProduitMappers produitMappers;

    public ProduitImpl(ProduitRepository produitRepository, IProduitMappers produitMappers) {
        this.produitRepository = produitRepository;
        this.produitMappers = produitMappers;
    }

    @Override
    public Produit saveProduit(ProduitPostDtos produit) {
       return this.produitRepository.save(produitMappers.produitPostDtoToProduit(produit));
    }

    @Override
    public List<ProduitGetDto> listProduit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
