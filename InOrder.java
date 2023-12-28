class InOrder {
	public static void main (String[] args) {
		int x = (int)(Math.random()*10.0);
		System.out.print(x + " ");
		int y = (int)(Math.random()*10.0);
		while (x <= y) {System.out.print(y + " "); int z = (int)(Math.random()*10.0);
	if (z >= y) y = z; else y = x - 1;}
	}
}
