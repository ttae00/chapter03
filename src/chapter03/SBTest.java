package chapter03;

public class SBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb= new StringBuffer("this");
		System.out.println(sb);
		//문자열 덧붙이기
		sb.append(" is pencil");
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
	
		//치환
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		//버퍼크기 조정
		sb.setLength(5);
		System.out.println(sb);
		
		//더 중요한 것은 문자열 + 연산
		//내부적으로 StringBuffer 객체로 변환된다.
		String s1= "hello" +"world" + 10+ true;
		String s2= "hello" +"world" + new Integer(10) + new Boolean(true);
		
		String s3= new StringBuffer("hello").
				append("world").
				append(10).
				append(true).toString();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	

}
