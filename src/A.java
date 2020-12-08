
public class A{
	private int x;
	public A(int x) {
		this.x = x;
	}
	
	public void isNEven(int x) throws Exceptie1{
		if ( x % 2 == 0 )
			System.out.println("Numarul " + x + " este par");
		else
			throw new Exceptie1("Numarul " + x + " nu este par");
	}
	
	public int getA() {
		return x;
	}
}
