/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit;

import java.util.List;
import sn.gainde2000.demo.business.produit.dtos.ProduitGetDto;
import sn.gainde2000.demo.business.produit.dtos.ProduitPostDtos;

/**
 *
 * @author asow
 */
public interface IProduit {

    public Produit saveProduit(ProduitPostDtos produit);
    
    public List<ProduitGetDto> listProduit();
    
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit;

import java.util.List;
import sn.gainde2000.demo.business.produit.dtos.ProduitGetDto;
import sn.gainde2000.demo.business.produit.dtos.ProduitPostDtos;

/**
 *
 * @author asow
 */
public interface IProduit {

    public Produit saveProduit(ProduitPostDtos produit);
    
    public List<ProduitGetDto> listProduit();
    
}
