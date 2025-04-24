package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
public class ReadingData {
	public static void main(String[] args) throws Exception {
         String path="C:\\Users\\User\\Desktop\\FileHandlingKolkata\\batman\\demo.txt";
         File file=new File(path);
         /*FileInputStream fis=new FileInputStream(file);
         
         int x;
         while((x=fis.read())!=-1){
        	 System.out.print((char) x);     	 
        	 
         }*/
         FileReader fr=new FileReader(file);
         int x;
         while((x=fr.read())!=-1){
        	 System.out.print((char) x);     	 
        	 
         }
         
         
	}

}
