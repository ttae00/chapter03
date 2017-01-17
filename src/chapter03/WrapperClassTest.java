package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i= new Integer(10);
		Character c= new Character('a');
		Float f= new Float(3.14);
		Boolean v= new Boolean(true);
		
		//auto boxingg
		//자동으로 new Integer(10);
		Integer j= 10;
		
		//auto unboxing
		//int k= 10 + j.intValue();
		int k= 10+ j;
		
		
		//swap(new Integer(10), new Integer(20));
		swap(10,20);
		
	}
	public static void swap(Integer i, Integer j){
		//이런 방식으로 객체이지만 절대 바뀌지 않는다.
		//이유는 wrapper 객체는 내부를 수정할수 없다.
	}

}
