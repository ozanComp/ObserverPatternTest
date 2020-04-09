package com.ozan.observerpatterntest;

	public class Woman implements Observer {
	    private Observable observable;
	
	    @Override
	    public void notify(String message) {
	    	 System.out.println("Received message " + message + " in Woman");
	    }
	
	    public void removeObserver(){
	        observable.removeObserver(this);
	    }
	}

	
	