// WAP create custom exception LeelaBackException and if john sal > leela sal the print Leela is out of life.

class LeelaBackException extends RuntimeException {
	public LeelaBackException(String message){
		super(message);
	}
}

class ChotaHaiTuException extends Exception {
	public ChotaHaiTuException(String message){
		super(message);
	}
}

public class Program_4 {
	public static void main(String[] args){
		double johnysal = 18000;
		double leelasal = 8000;

		int age = 8;

		try {
            if (age < 18) {
                throw new ChotaHaiTuException("Age kam hai abhi.");
            } else {
                System.out.println("You are eligible");
            }
        } catch (ChotaHaiTuException e) {
            System.out.println(e.getMessage());
        }

		try {
			if (johnysal > leelasal){
				throw new LeelaBackException("Leela is on the life.");
			} else {
				System.out.println("Leela is out of life.");
			}
		} catch(LeelaBackException e){
			System.out.println(e.getMessage());
		}
	}
}
