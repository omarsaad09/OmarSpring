package com.iset.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import com.iset.produits.entities.Produit;
import com.iset.produits.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private ProduitRepository produitRepository;

	@Test
	 public void testCreateProduit() {
		Produit prod = new Produit("PC Assus",2200.500,new Date());
		produitRepository.save(prod);
	}	
	@Test
	public void testFindProduit() {
		Produit p = produitRepository.findById(1L).get();
				System.out.println(p);
	}
	@Test
	public void testUpdateProduit() {
		Produit p = produitRepository.findById(1L).get();
		p.setPrixProduit(2000.0);
		produitRepository.save(p);

				System.out.println(p);
	}
	@Test
	public void testDeleteProduit() {
		 produitRepository.deleteById(2L);
				
	}
	@Test
	public void testFindAllProduit() {
		List<Produit> prods = produitRepository.findAll();
        for(Produit p:prods)		
        	System.out.print(p);
	}

}