
public class main {

	public static void main(String[] args) {
		C numere = new C(12, 13, 15);
		
		try {
			numere.isNEven(numere.getA(), numere.getB(), numere.getC());
		}
		catch(Exceptie3 e) {
			System.out.println(e.getMessage() + " exceptie 3");
		}
		catch(Exceptie2 e) {
			System.out.println(e.getMessage() + " exceptie 2");
		}
		catch(Exceptie1 e) {
			System.out.println(e.getMessage() + " exceptie 1");
		}

	}

}
