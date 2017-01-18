package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기반 스트림은 System.in (표준 입력,키보드를 사용)
		BufferedReader br=null;
		try {
			
			InputStreamReader isr= new InputStreamReader(System.in,"utf-8");
			
			 br= new BufferedReader(isr);
			
			String line=null;
			
			while(true){
				System.out.println(">>");
				line= br.readLine();
				if("exit".equals(line)){
					break;
				}
				
				System.out.println(line);
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		} finally{
			try {
				if(br != null){
				br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			
		}
		
	}

}
