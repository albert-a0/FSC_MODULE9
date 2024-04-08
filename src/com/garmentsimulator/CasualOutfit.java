package com.garmentsimulator;

public class CasualOutfit extends Outfit {

	@Override
	Garment getTop() {
		// TODO Auto-generated method stub
		return new CasualTop();
	}

	@Override
	Garment getPants() {
		// TODO Auto-generated method stub
		return new CasualPants();
	}

	@Override
	Garment getShoes() {
		// TODO Auto-generated method stub
		return new CasualShoes();
	}

}
