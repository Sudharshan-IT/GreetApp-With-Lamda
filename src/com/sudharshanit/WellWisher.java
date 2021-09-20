package com.sudharshanit;

public class WellWisher {
	public static void wish(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {
		//AnnonyMours Implementation
		wish(new Greeting() {

			@Override
			public void greet() {
				System.out.println("Hindi:** Namaskar **");
				
			}
			
		});
		wish(new Greeting() {

			@Override
			public void greet() {
			System.out.println("Telugu: ** Namaskaram");
				
			}
			
		});
		wish(new Greeting() {

			@Override
			public void greet() {
				System.out.println("English: ** Good Moring **");
				
			}
			
		});
		
	}
}
