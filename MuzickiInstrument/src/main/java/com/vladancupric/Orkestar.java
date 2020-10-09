package com.vladancupric;

import java.util.List;

public class Orkestar {
	private String naziv;
	private List<Muzicar> orkestar;

	public Orkestar() {
		super();
	}
	public Orkestar(String naziv, List<Muzicar> orkestar) {
		super();
		this.naziv = naziv;
		this.orkestar = orkestar;
	}
	
	
	
	public List<Muzicar> getOrkestar() {
		return orkestar;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Muzicari u Orkestru:" + this.naziv+ " su: \n");
		for(Muzicar o : orkestar) {
			sb.append(o);
			sb.append("\n");
		}
		return sb.toString();
	}
	

}
