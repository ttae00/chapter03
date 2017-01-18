package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		FileInputStream fis= null;
		try {
			
			//문자 단위로 읽음
			int count=0;
			fr= new FileReader("test.txt");
			int data=0;
			
			while ((data= fr.read()) != -1){
				count++;
				System.out.print( (char)data );
			}
			System.out.println("\n읽은횟수:"+ count);
			System.out.println("\n======");
			//바이트 단위로 읽음
			count=0;
			fis= new FileInputStream("test.txt");
			
			while((data= fis.read()) != -1){
				count++;
				System.out.print((char)data);
			}
			System.out.println("\n읽은횟수:"+ count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없습니다.:"+ e);
		} catch (IOException e){
			System.out.println("읽기 오류:"+ e);
		} finally{
			try {
				if(fr !=null){
				fr.close();
				}
				if(fis !=null){
				fr.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
