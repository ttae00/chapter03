package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br= null;
		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");

			}
			System.out.println("=========파일정보=========");
			System.out.println("경로>>" + file.getAbsolutePath());
			System.out.println("사이즈>>" + file.length() + "Bytes");
			// Date d = new Date(file.lastModified());
			// SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd
			// hh:mm:ss");

			System.out.println(
					"마지막 수정일>> " + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));

			System.out.println("=========전화번호=========");
			//FileInputStream fis = new FileInputStream(file);
			//InputStreamReader isr= new InputStreamReader(fis,"UTF-8");
			br= new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
			
			String line= null;
			while((line = br.readLine()) != null){
				//그냥 출력하는 것
				//System.out.println(line);
				StringTokenizer st= new StringTokenizer(line,"\t ");
				
				int index= 0;
				while(st.hasMoreTokens()){
					String token= st.nextToken();
					if(index ==0){
						System.out.print(token+ ":");
					}else if(index == 2){
						System.out.print(token + "-");
					}else if(index ==3){
						System.out.print(token);
					}else{
						System.out.print(token + "-");
					}
					
					index++;
				}
				System.out.println("");
			}
							
		} catch (FileNotFoundException e) {
			System.out.println("파일찾을수 없음-" + e);
		} catch (UnsupportedEncodingException e) {
			System.out.println("인코딩 오류-" + e);
		} catch (IOException e){
			System.out.println("입출력 오류-" + e);
		} finally{
			try {
				if( br != null){
				br.close();
			}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
		//
		// String line= "둘리 010 0000 0000";
		// StringTokenizer st= new StringTokenizer(line,"\t ");
		//
		// int index=0;
		// while(st.hasMoreTokens()){
		// String token = st.nextToken();
		// if(index ==0){
		// System.out.println(token+ ":");
		// }else if(index ==3){
		// System.out.println(token);
		//
		// }else{
		// System.out.println(token +"-");
		// }
		// index++;
		// }
	

}
