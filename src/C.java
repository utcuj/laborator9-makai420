
public class C extends B{
	private int x;
	public C (int x, int y, int z) {
		super(x,y);
		this.x = z;
	}
	
	public void isNEven (int x, int y, int z) throws Exceptie1, Exceptie2, Exceptie3{
		super.isNEven(x, y);
		if ( z % 2 == 0)
			System.out.println("Numarul " + z + " este par");
		else
			throw new Exceptie3("Numarul " + z + " nu este par");
	}
	
	public int getC() {
		return x;
	}
}
