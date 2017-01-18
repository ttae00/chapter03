package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
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
			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String name = sc.next();
				String phone1 = sc.next();
				String phone2 = sc.next();
				String phone3 = sc.next();

				System.out.println(name + ":" + phone1 + "-" + phone2 + "-" + phone3);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}

}
