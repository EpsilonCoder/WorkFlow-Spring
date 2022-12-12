# poc-structuration code

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit.dtos;

import java.util.List;
import org.mapstruct.Mapper;

import sn.gainde2000.demo.business.produit.Produit;

/**
 *
 * @author asow
 */
@Mapper(componentModel = "spring")
public interface IProduitMappers {

    Produit produitPostDtoToProduit(ProduitPostDtos produit);

    List<ProduitGetDto> toProduitGetDtos(List<Produit> produit);

    ProduitGetDto toProduitGetDto(Produit produi);

}
