import java.io.*;

public class FileCopy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("FileCopy.java");
			FileOutputStream fos = new FileOutputStream("FileCopy.bak"); //한글파일
			
			int data = 0;
			while((data=fis.read())!=-1) {
				fos.write(data);
			}
			
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
