/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.gainde2000.demo.business.produit.dtos.ProduitGetDto;
import sn.gainde2000.demo.business.produit.dtos.ProduitPostDtos;

/**
 *
 * @author asow
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produit")
public class ProduitController {

    private final IProduit produitService;

    public ProduitController(IProduit produitService) {
        this.produitService = produitService;
    }

    @PostMapping("/create")
    public ResponseEntity<Void> saveProduit(@RequestBody ProduitPostDtos produitPostDto) {
        produitService.saveProduit(produitPostDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/listProduits")
    public ResponseEntity<List<ProduitGetDto>> getProduit() {
        List<ProduitGetDto> produit = produitService.lis/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sn.gainde2000.demo.business.produit;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sn.gainde2000.demo.business.produit.dtos.ProduitGetDto;
import sn.gainde2000.demo.business.produit.dtos.ProduitPostDtos;

/**
 *
 * @author asow
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/produit")
public class ProduitController {

    private final IProduit produitService;

    public ProduitController(IProduit produitService) {
        this.produitService = produitService;
    }

    @PostMapping("/create")
    public ResponseEntity<Void> saveProduit(@RequestBody ProduitPostDtos produitPostDto) {
        produitService.saveProduit(produitPostDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/listProduits")
    public ResponseEntity<List<ProduitGetDto>> getProduit() {
        List<ProduitGetDto> produit = produitService.listProduit();
        return ResponseEntity.ok().body(produit);

    }
}
