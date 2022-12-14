package org.tnsindia.enumDemo;

public enum EnumCards implements CardDemo {
	HEART,DIAMAND,SPADES
	
	
	;

	@Override
	public void accept() {
		System.out.println("Selected shape in the cards are:"+this);
		
	}

}
