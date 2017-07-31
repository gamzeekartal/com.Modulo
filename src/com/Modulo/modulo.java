package com.Modulo;

public class modulo {

	public static void main(String[] args) {
		for(int i=-5; i<=30; i++){
			toBinary(i);
			System.out.print("  ,toBinaryString:  " + Integer.toBinaryString(i));
			System.out.println("\n");
		}
		
			
	}
	public static String toBinary(int numbers){		
		String result="";
		int mod;
		if(numbers>0){
			while(numbers>0){
				mod=numbers%2;
				result= mod + result;
				numbers/=2;
			}
			System.out.print("method toBinary: " + result);
			return result;
		}
		
		else{
			numbers = (-1)*numbers;
			while(numbers>0){
				mod=numbers%2;
				result= mod + result;
				numbers/=2;
			}
			result = "-"+ result;
			System.out.println("method toBinary: " + result);
			return result;
		}		
		
	}
}
