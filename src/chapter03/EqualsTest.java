package chapter03;

public class EqualsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Point 객체 비교
		(equals, hashCode 오버라이딩이 안된 경우)
		*/
		Point pt1= new Point(10,20);
		Point pt2= new Point(10,20);
		Point pt3= pt2;
	
		
		// (==) 연산자에서  두 개의 항이 객체 참조 변수인 경우에는
		// 두 객체의 동일여부
		System.out.println(pt1 == pt2);
		System.out.println(pt2 == pt3);
		
		//동질성 비교시에는 == 대신에 equals 메소드를 사용해야한다.
		System.out.println(pt1.equals(pt2));
		System.out.println(pt2.equals(pt3));
		
		//equals가 오버라이딩이 안된 클래스의 객체의 equals 비교는 
		//== 와 완전히 같다.
		
		
		/*String 객체 비교
		(equals, hashCode 오버라이딩이 되어 있는 경우)
		*/
		
		String s1= new String("hello");
		String s2= new String("hello");
		String s3= s2;
		
		System.out.println(s1== s2);
		System.out.println(s2== s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		//hashCode() 비교
		//hashCode가 내용으로 override 되어있다.
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		//참조값 (객체ID)
		System.out.println("해시 참조 id");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		//객체의 내용을 기반으로 hashCode()를 오버라이딩 하면
		//참조 변수가 가지고 있는 참조값고 틀린 값을 가지게 된다.
		
		/*
		 * Literal를 사용하는 경우
		 * JVM 안의 리터럴 풀에서 객체 생성을 관리하기 때문에 
		 * 문자열의 해싱값이 같은 문자여 객체는 2개이사 만들지 않는다.
		 * 
		 */
		
		String str1= "hello";
		String str2= "hello";
		String str3= str1;
		
		System.out.println(str1 ==str2);
		System.out.println(str2 ==str3);
	}
	

}
