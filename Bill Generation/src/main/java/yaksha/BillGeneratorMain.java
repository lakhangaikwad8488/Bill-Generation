package main.java.yaksha;

import java.util.Scanner;

public class BillGeneratorMain {

	public static void main(String[] args) {
		SnacksDetails snack=new SnacksDetails();
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the no of pizzas bought:");
	        int pizza=sc.nextInt();
	        System.out.println("Enter the no of puffs bought:");
	        int puff=sc.nextInt();
	        System.out.println("Enter the no of cool drinks bought:");
	        int drink=sc.nextInt();
	        boolean status= snack.generateBill(pizza,puff,drink);
	}

	
}
