/*
#feedback
1. Try to concider next time a redundant version, for instance:
	double p = Math.random();
 	if p>0.5 -> boy
  	else -> girl
   this would make your code much shorter and more readable and save your time to think on another logic and use cases.
*/


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
