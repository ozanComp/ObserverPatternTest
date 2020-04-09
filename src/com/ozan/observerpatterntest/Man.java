package com.ozan.observerpatterntest;

	public class Man implements Observer {
	    private Observable observable;
	
	    @Override
	    public void notify(String message) {
	        System.out.println("Received message " + message + " in Man");
	    }
	
	    public void removeObserver(){
	        observable.removeObserver(this);
	    }
	    
	    public void setObservable(Observable observable) {
	        this.observable = observable;
	    }
	}

	
	