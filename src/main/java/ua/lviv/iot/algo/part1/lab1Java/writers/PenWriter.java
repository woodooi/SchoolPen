package ua.lviv.iot.algo.part1.lab1Java.writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import lombok.NoArgsConstructor;
import ua.lviv.iot.algo.part1.lab1Java.models.Pen;

import static java.util.Arrays.stream;

@NoArgsConstructor

public class PenWriter {
    private String writerCSV;
    private final File file = new File("C:\\Users\\Master\\SchoolPen\\testCSV.csv");


    public void writeToFile(List<Pen> pens) {

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already created");
            }
        } catch (IOException e) {
            System.out.println("Error - " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                FileWriter writer = new FileWriter("testCSV.csv");
                for (Pen pen : pens) {
                    writer.write(pen.getHeaders() + "\n");
                    writer.write(pen.toCSV() + "\n");
                }
                writer.close();
            } catch (Exception e) {
                System.err.println("Error - " + e.getMessage());
            }
        }
    }
}
