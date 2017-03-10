package com.sanaa.controllers;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanaa.dao.IProduitRepository;
import com.sanaa.entity.Produit;


@Path("/")
@Component

public class ProduitController {
	
	@Autowired
	
	private IProduitRepository produitRepository;
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/test")
	
	
	public String test(){
		return "test";
	
	}
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/save")
	public Produit saveProduit(){
		
		Produit p=new Produit();
		p.setDesignation("GHYT");
		p.setPrix(1289.00);
		
		produitRepository.save(p);
		
		return p;
	}
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
	public List<Produit> getProduits(){
	
	return produitRepository.findAll();	
		
	}
	
	
	


}
