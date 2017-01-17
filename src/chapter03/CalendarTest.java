package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal= Calendar.getInstance();
		printDate(cal);
		
		//특정날짜 셋팅하기
		cal.set(Calendar.YEAR, 2007);
		cal.set(Calendar.MONTH, 10); //11월
		cal.set(Calendar.DATE, 12);//12일
	
		printDate(cal);
		
		//기념일
		cal.set(2014, 2, 19); //2013-03-19 기념일
		cal.add(Calendar.DATE, 1000);
		printDate(cal);
	}
	
	public static void printDate(Calendar cal){
		int year= cal.get(Calendar.YEAR);
		int month= cal.get(Calendar.MONTH);
		int date= cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);//1(일)~7(토)
		int hour= cal.get(Calendar.HOUR);
		int minute= cal.get(Calendar.MINUTE);
		int sec= cal.get(Calendar.SECOND);
		
		System.out.println(
				year + "-" + (month+1)+ "-"
						+date + "(" +day+")" 
						+hour+ ":"
						+minute+ ":"
						+sec);
		
	}

}
