package com.te.coupling;

public class Choice {
	
	Engine engine;
	public void getADriver(int car) {
		if(car==1) {
		
		this.engine=new Engine();
          engine.Color();
		
		}
		if(car==2) {
			
			this.engine=new Engine();
			engine.Color1();
		}
		
		
}
}
