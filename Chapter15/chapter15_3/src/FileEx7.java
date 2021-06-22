import java.io.*;
import java.util.Scanner;

public class FileEx7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String currDir = System.getProperty("user.dir");
		
		File dir = new File(currDir);
		final String pattern = scan.nextLine();
		
		String[] files = dir.list(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.indexOf(pattern) != -1;
			}
		});
		
		for(int i=0; i<files.length; i++) {
			System.out.println(files[i]);
		}
	}
}
