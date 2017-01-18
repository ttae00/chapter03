package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
				
		try {
			fis= new FileInputStream("picture.JPG");
			
			fos= new FileOutputStream("picture2.jpg");
			
			int data= 0;
			
			while((data= fis.read()) != -1){
					fos.write(data);
			}
			
				
			}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
				System.out.println("파일이 없습니다- "+e);
			} catch (IOException e) {
			// TODO Auto-generated catch block
				System.out.println("I/O 오류- "+e);
			}finally{
				//자원정리
				try {
					if(fis != null){
					fis.close();
					}
					
					if(fos !=null){
					fos.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
}
