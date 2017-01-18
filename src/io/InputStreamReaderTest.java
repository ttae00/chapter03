package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader isr= null;
		try{
			//ms949 -> utf8(java)
			isr= new InputStreamReader(new FileInputStream("ms949.txt"),"ms949");
			
			int data = 0;
			while((data = isr.read()) != -1){
				System.out.print((char)data);
			}
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을수 없음" + e);
		}catch(IOException e){
			System.out.println("io 에러-" +e);
		}finally{
			try {
				if(isr !=null){
				isr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
