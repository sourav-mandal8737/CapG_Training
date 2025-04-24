package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
	public static void main(String[] args) throws IOException {
        String path="C:\\Users\\User\\Desktop\\FileHandlingKolkata\\batman\\demo.txt";
        
        File file=new File(path);
        
        //FileOutputStream fos=new FileOutputStream(file,true);
        //String message=",would u like to have breakfast";
        //byte[] arr=message.getBytes();
        //fos.write(arr);
        
        
        
        /*for(int i=0;i<message.length();i++) {
        	fos.write(message.charAt(i));
        }*/
        
        
        String message=",would u like to have dinner";
        FileWriter fw=new FileWriter(file,true);

        BufferedWriter bw=new BufferedWriter(fw);
        
        for(int i=0;i<message.length();i++) {
    	bw.write(message.charAt(i));    	
        }
       // fw.flush();
        bw.close();
    	fw.close();   

	
	}

}
