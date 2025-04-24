package File_Handling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\User\\Desktop\\FileHandlingKolkata\\batman\\demo.txt";
		//String renamepath="C:\\Users\\User\\Desktop\\FileHandlingKolkata\\batman";

		
		File file=new File(path);
		//File rename=new File(r1`5 enamepath);
		
		//file.mkdir();//create folder
		//file.mkdirs();//create nested folders
		//file.renameTo(rename);
		//System.out.println(file.getAbsolutePath());
		//System.out.println(file.getParentFile());
		//System.out.println(file.getName());
		//file.delete();
		
		
		/*file.createNewFile();
		
		String[] arr=file.list();
		
		for(String s:arr) {
			System.out.println(s);
		}*/
		
		
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
	}

}
