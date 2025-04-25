package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvWrite {
    public static void main(String[] args) throws Exception {
        try {
            String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\batman\\studentData.csv";
            File file = new File(path);
            FileWriter writer = new FileWriter(file);

            writer.append("name,marks\n");
            writer.append("John,85\n");
            writer.append("Neha,90\n");
            writer.append("Aman,78\n");

            writer.flush();
            writer.close();

            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
