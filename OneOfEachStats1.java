/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]);
		int familywithtwo = 0;
		int familywiththree = 0;
		int familywithmore = 0;
		double avrage = 0.0;
		for (int index = 0; index < T ; index++) {
			double z = Math.random();
			String s = "";
			boolean boy = false;
			boolean girl = false;
			while (!(boy==true&&girl==true)) {
				avrage++; 
				if (z >= 0.5) { s = s +"b ";
					z = Math.random(); 
					boy = true;
				} else {
					s = s + "g ";
					z = Math.random(); 
					girl = true; 
				}
			}
			int x = s.length()/2;
			if (x == 2) {
				familywithtwo++;
			}
           	 else if (x == 3) {
				familywiththree++;
			} else {
				familywithmore++;
			}
		}
		avrage = avrage / T;
		System.out.println("Average: " + avrage + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + familywithtwo);
		System.out.println("Number of families with 3 children: " + familywiththree);
		System.out.println("Number of families with 4 or more children: " + familywithmore);
	}
}
