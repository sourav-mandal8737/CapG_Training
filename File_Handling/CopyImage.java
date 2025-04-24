package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImage {
	public static void main(String[] args) throws Exception {
		//creating new jpg file
		String destinationPath="C:\\Users\\User\\Desktop\\FileHandlingKolkata\\batman\\rcb.jpg";
		File destinationFile=new File(destinationPath);
		destinationFile.createNewFile();
		
		//creating file object of source image
		String sourcePath="C:\\Users\\User\\Downloads\\download.jpg";
		File sourceFile=new File(sourcePath);
		
		//reading data from source image
		FileInputStream fis=new FileInputStream(sourceFile);
		byte[] arr=new byte[(int)sourceFile.length()]; //getting the size of source file and creating a byte array of that
		//size to store image data in the form of byte
		fis.read(arr); //reads data from source file and stores in byte array
		
		
		//writing data
		FileOutputStream fos=new FileOutputStream(destinationFile);
		fos.write(arr);
		fis.close();
		
	}

}
