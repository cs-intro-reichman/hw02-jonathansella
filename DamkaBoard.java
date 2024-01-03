class DamkaBoard {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		String s = "";
		for (int i = 0; i < a; i++) {
			if (i<a-1) {
			s = s + "* ";
		} else {
			s = s + "*";}
		}
	    for (int i = 0; i < a; i++) {
			if (i % 2 == 0) {
				System.out.println(s + " ");
			} else {
				System.out.println(" " + s);
			}
		}
		System.out.println();
	}	
}
