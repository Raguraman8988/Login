package com.training.org;

// Interface 
public interface InterA extends InterB, IntraC {
	void demoA();

	void demoB();
	
	@Override
	default void demoI() {
		
	}
	
	@Override
	default void demoY() {
		
	}
}
