class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String a = "";
		int b = s.length() - 1;
		while ( b >= 0) {char x = s.charAt (b);
		a = a + x; b = b - 1;}
		System.out.println(a);
		System.out.println( "The middle character is " + s.charAt((s.length()-1)/2));
	}
}
