package com.springs.beans;

public class PoeticJuggler extends Juggler{
	private Poem poem;
	
	public PoeticJuggler(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJuggler(int beanBags, Poem poem ) {
		super();
		this.poem = poem;
		super.beanBags = beanBags;
	}
	
	@Override
	public void perform() {
		super.perform();
		System.out.println("while reciting");
		poem.recite();
	}
	
	

}
