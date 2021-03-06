package com.sudharshanit;

public class WellWisher {
	public static void wish(Greeting greeting) {
		greeting.greet();
	}
	public static void invite(Welcome welcome) {
		String msg = welcome.welcome("Sudha");
		System.out.println(msg);
	}

	public static void main(String[] args) {
		//AnnonyMours Implementation
		/*
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
		*/
		//Using Lamda Expression
		wish(()->{
			System.out.println("Namaste...!");
		});
		wish(()->{
			System.out.println("Good Moring...!");
		});
		wish(()->{
			System.out.println("Namaskaram");
			
		});
		invite((user)->{
			return "Welcome...."+user;
		});
		
	}
}
