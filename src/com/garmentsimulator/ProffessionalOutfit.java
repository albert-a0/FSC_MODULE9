package com.garmentsimulator;

public class ProffessionalOutfit extends Outfit{

	@Override
	Garment getTop() {
		// TODO Auto-generated method stub
		return new ProfessionalTop();
	}

	@Override
	Garment getPants() {
		// TODO Auto-generated method stub
		return new ProfessionalPants();
	}

	@Override
	Garment getShoes() {
		// TODO Auto-generated method stub
		return new ProfessionalShoes();
	}


}
