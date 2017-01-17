package chapter03;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s= "hello";
		
		//escape문자
		String s="i say \"hello\" ";
		System.out.println(s);
	
		//문자형에서 '-> 출력
		char c= '\'';
		
		//C:\dowork 출력
		String s1= "c:\\dowork";
		System.out.println(s1);
		
		//\t, \n, \r\n
		System.out.println("\n");
		
		// + 연산이 가능하다.
		
		String s2= "Hello"+"java";
		System.out.println(s2.charAt(4));
		String s3="value= "+2;
		
	}

}
