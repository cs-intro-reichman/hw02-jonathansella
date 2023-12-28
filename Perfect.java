class Perfect {
	public static void main (String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = 1;
		int test = 0;
		String s = "";
		while (a > b ) {if ((a % b) == 0) {
			test = test + b; s = s + b + " + ";} b = b + 1;}
		s = s.substring(0, s.length()-2);	
        if (test - a == 0) {System.out.println(a + " is a perfect number since " + a + " = " + s);
		}else {System.out.println(a + " is not a perfect number");}
		}	
	}