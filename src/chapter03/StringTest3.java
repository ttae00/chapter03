package chapter03;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aBcAbCabcABC";
		//charAt
		System.out.println(s.charAt(2));
		
		//indexOf
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("xyz"));
		
		//length
		System.out.println(s.length());
		
		//replace: 치환
		System.out.println(s.replace('a', 'r'));
		System.out.println(s);
		
		//replaceAll: 치환
		System.out.println(s.replaceAll("abc", "123"));
		
		//subString
		System.out.println(s.substring(0, 3));
		
		//toLowerCase()
		System.out.println(s.toLowerCase());
	
		String str1= "abcd";
		String str2=",efg ";
		
		//concat : 문자열
		System.out.println(str1);
		str1 =str1.concat(str2);
		System.out.println(str1);
		
		//trim: 공백 제거 단 앞뒤의 공백만 제거
		
		System.out.println("-" + str1 + "-");
		System.out.println("-" + str1.trim() + "-");
		
		//split 문자열 분리
		String[] sp=str1.split(",");
		for( String sv:sp){
			System.out.println(sv);
		}
		//split 예외
		String str5= "abcdef";
		String[] result= str5.split(",");
		for(String r:result){
			System.out.println(r);
		}
	}

}
