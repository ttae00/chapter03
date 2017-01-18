package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br= null;
		
		try {
			FileReader fr= new FileReader("./src/io/BufferedReaderTest.java");
			br = new BufferedReader(fr);
			
			String line=null;
			int index=0;
			while((line= br.readLine()) != null){
				System.out.println(++index + ":"+line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("open fail:"+e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file io fail" + e);
		}finally{
			try {
				if(br != null){
				br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
			
				System.out.println("close fail-" + e);
			}
		}
	}
}
