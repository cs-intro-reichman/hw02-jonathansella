class DamkaBoard {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = a - 1;
		String s = "";
    while (a > 0) {a = a - 1; s = s + "* ";}
	while (b >= 0) {System.out.println(s); b = b - 1; if (b % 2 == 0) {s = " " + s;}
	else {s = s.substring(1, s.length());}}	
	}
	}