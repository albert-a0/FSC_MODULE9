package com.garmentsimulator;

public class Factory {

	public static Outfit getOutfit(String occ) {
		Outfit result = null;
		if(occ.equals("professional")) {
			result = new ProffessionalOutfit();
		}else if(occ.equals("casual")) {
			result = new CasualOutfit();
		}else if(occ.equals("party")) {
			
		};
		
		return result;
	}
	
}
