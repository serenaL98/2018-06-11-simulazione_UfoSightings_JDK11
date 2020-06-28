package it.polito.tdp.ufo.model;

import it.polito.tdp.ufo.db.SightingsDAO;

public class Model {
	
	private SightingsDAO dao;
	
	public Model() {
		this.dao = new SightingsDAO();
	}

}
