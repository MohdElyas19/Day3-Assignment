package com.day3Assingnment;

public class VowelConsonent {
	String vowelOrConst;
	void javaApplication() {
		if(vowelOrConst == "a" | vowelOrConst == "e" | vowelOrConst == "I" | vowelOrConst == "o") {
			System.out.println("The char is vowel");
		}
		else if(vowelOrConst != "a" | vowelOrConst != "e" | vowelOrConst != "I" | vowelOrConst != "o"){
			System.out.println("The char is consonent");
		}
		else {
			System.out.println("error");
		}
	}

	public static void main(String[] args) {
		VowelConsonent v1 = new VowelConsonent();
		v1.vowelOrConst = "a";
		v1.javaApplication();
		
		VowelConsonent v2 = new VowelConsonent();
		v2.vowelOrConst = "b";
		v2.javaApplication();
	}

}
