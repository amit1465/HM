package com.springs.beans;

public class Juggler implements Performer{
	
	protected int beanBags = 3;
	
	public Juggler() {
	}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("JUGGLING "+beanBags+" BEANBAGS");
		
	}
	
	// changed in juggler
	
	// change in juggler agian

}
