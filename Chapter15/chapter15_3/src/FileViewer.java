import java.io.*;

public class FileViewer {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("FileViewer.java");
		int data = 0;
		
		while((data=fis.read())!=-1) {
			char c = (char)data;
			System.out.print(c);
		}
	}
}
