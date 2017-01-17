package collection;

public class Value {
	private int val;
	
	public Value(int val){
		this.val= val;
	}
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "Value [val=" + val + "]";
	}

}
