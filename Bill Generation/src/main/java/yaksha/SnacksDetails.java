package main.java.yaksha;

public class SnacksDetails {
	 public boolean generateBill(int pizza, int puff, int drink) {
		
        int tp=pizza*100,tf,td;
        tf=puff*20;
        td=drink*10;
        float total=tp+tf+td;
        System.out.println("Bill Details");
        System.out.println("No of pizzas:"+pizza);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cooldrinks:"+drink);
        System.out.println("Total price="+total);
         System.out.println("ENJOY THE SHOW!!!");
		return true;
	}

}
