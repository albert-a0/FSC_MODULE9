package com.garmentsimulator;

public abstract class Outfit {
	abstract Garment getTop();
	abstract Garment getPants();
	abstract Garment getShoes();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "TOP: " + this.getTop() + "\nPANTS: " + this.getPants()+"\n"+
				"SHOES: " + this.getShoes();
	}
}
