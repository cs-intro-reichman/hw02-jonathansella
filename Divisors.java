class Divisors {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int a = 1;
		while (x >= a) {if (x % a == 0 ) System.out.println(a); a = a + 1;}
	}
}
