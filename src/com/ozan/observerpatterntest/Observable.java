package com.ozan.observerpatterntest;

	public interface Observable {
		void addObserver(Observer observer);
	    void removeObserver(Observer observer);
	    void notifyObserver();
	}

	
	