package com.vladancupric;

public class Muzicar {
	private Instrument instrument;
	private String ime;
	
	public Muzicar() {
		
	}
	public Muzicar(String ime) {
		super();
		this.ime = ime;
	}
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	@Override
	public String toString() {
		return "Muzicar [instrument=" + instrument + ", ime=" + ime + "]";
	}
	
	
	
	

}
