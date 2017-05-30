import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int dieNumber;
        Random rnd = new Random();
        dieNumber = 1 + rnd.nextInt(6);
        
        
        System.out.println("Your die roll was : " + dieNumber);
        
		
		
		
		
	}

}
