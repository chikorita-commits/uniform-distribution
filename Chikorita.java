public class Chikorita {
	public static void main(String[] args) {
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 10; i++) {
				double x = Math.random();
				double time = x*35-15;
				double tempTime = Math.round(time*10);
				time = tempTime/10;
				System.out.print(time+" ");
			}
			System.out.println();
		}
		
	}
}
