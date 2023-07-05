package com.esercizio1.day8;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class ClassThread extends Thread {

	private Logger log = LoggerFactory.getLogger(Thread.class);
	private String message;

	public ClassThread(String message) {
		super();
		this.message = message;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			try {
				log.info("N." + i + " - " + message);
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				log.error(e.getMessage());
			}
		}
	}
	
}
