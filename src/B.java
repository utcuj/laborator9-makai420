
public class B extends A{
	private int x;
	public B (int x, int y) {
		super(x);
		this.x = y;
	}
	
	public void isNEven(int x, int y) throws Exceptie2, Exceptie1{
		super.isNEven(x);
		if ( y % 2 == 0)
			System.out.println("Numarul " + y + " este par");
		else
			throw new Exceptie2("Numarul " + y + " nu este par");
	}
	
	public int getB() {
		return x;
	}
	
	
}
