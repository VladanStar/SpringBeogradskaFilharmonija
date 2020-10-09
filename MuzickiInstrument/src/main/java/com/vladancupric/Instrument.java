package com.vladancupric;

public class Instrument {
	
	private String naziv;
	enum TipInstrumenta{UDARALJKE, ZICANI,DUVACKI}
	
	private TipInstrumenta tip;
	public Instrument(){
		
	}

	public Instrument(String naziv, TipInstrumenta tip) {
		super();
		this.naziv = naziv;
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "Instrument [naziv=" + naziv + ", tip=" + tip + "]";
	}
	
	
	
	
	

}
