class OneOfEach {
	public static void main (String[] args) {
		double b = Math.random();
		double g = Math.random();
		String s = "";
		boolean boy = false;
		boolean girl = false;
		while (!(boy==true&&girl==true)) { 
            if (b>g) { s = s +"b ";
		b = Math.random();
	    g = Math.random(); 
		boy = true;
	        }else{s = s + "g ";
        b = Math.random();
		g = Math.random(); 
		girl = true;}}
		int x = s.length()/2;
		System.out.println(s);
		System.out.println("you made it... and you now have " + x + " children.");
       }
	}