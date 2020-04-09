package com.ozan.observerpatterntest;

		public class Main {
			public static void main(String[] args) {
				try{
					Man man = new Man();
			        Woman woman = new Woman();
		
			        NoticeObservable noticeObservable = new NoticeObservable();
		
			        man.setObservable(noticeObservable);
		
			        noticeObservable.addObserver(man);
			        noticeObservable.addObserver(woman);
			        noticeObservable.notifyObserver();
		
			        man.removeObserver();
			        noticeObservable.notifyObserver();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		
		