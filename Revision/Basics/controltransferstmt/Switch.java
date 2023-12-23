class Switch {
	public static void main(String[] args) {
		int a = 10;

		switch (a){
			case 2:
				a += 200;
				System.out.println(a);
				break;
			case 4:
				a += 400;
				System.out.println(a);
				break;
			case 10:
				a += 1000;
				System.out.println(a);
				break;
			case 8:
				a += 800;
				System.out.println(a);
				break;
			default:
				System.out.println("Hello default.");
		}
	}
}
