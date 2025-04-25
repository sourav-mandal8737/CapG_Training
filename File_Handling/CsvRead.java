package File_Handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CsvRead {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\FileHandlingKolkata\\batman\\studentData.csv";
        File file = new File(path);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isHeader = true;

            while ((line = reader.readLine()) != null) {
                if (isHeader) {
                    isHeader = false; // Skip header
                    continue;
                }

                String[] values = line.split(",");
                String name = values[0];
                int marks = Integer.parseInt(values[1]);

                System.out.println("Name: " + name + ", Marks: " + marks);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

