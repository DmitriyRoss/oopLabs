package ua.khpi.oop.ross02;
import java.util.Random;



class PrimeNumber{
    private int number;
    private boolean check = true;

    public PrimeNumber(int num){
        number = num;
    }
    public boolean checkNum(){
        for(int i =2; i<number; i++){
            if(number%i==0 ){
                check = false;
                break;
            }
         
        } return check;
    }
}

public class Main {
	public static void main(String[] args) {
		 Random dice = new Random();
	        boolean check;
	        for(int i = 1; i < 10; i++) {
	        	int number = 2+dice.nextInt(100);
	        	 PrimeNumber prime = new PrimeNumber(number);
	        check = prime.checkNum();
	        if(check == true) {
	        	System.out.println("Число  " +number+ "  простое");
	        }
	        
	        else {
	        	System.out.println("Число  " +number+ "  не является простым");
	        }
	        	
	        }
			
			
	}

	
}
