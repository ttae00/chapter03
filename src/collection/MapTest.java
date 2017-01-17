package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map= new HashMap<String, Integer>();
		
		map.put("둘리", new Integer(100));
		map.put("마이콜", 60); //autoboxing일어나서 new Integer(60)이 자동으로 된다
		map.put("도우넛", 80);
		map.put("도우넛", 100);//새로 값이 세팅된다
		
		
		Integer score1 =map.get("마이콜");
		System.out.println(score1);
		
		int score2= map.get("도우넛"); // auto unboxing
		System.out.println(score2);
		
		//평균
		Set<String> keySet=map.keySet();
		int count = keySet.size();
		
		int sum=0;
		Iterator<String> it= keySet.iterator();
		while(it.hasNext()){
			String key= it.next();
			//System.out.println(key);
			int score =map.get(key);
			//System.out.println(key + ":" + score);
			sum += score;
		}
		System.out.println("평균: " + (sum/count));
	}

}
