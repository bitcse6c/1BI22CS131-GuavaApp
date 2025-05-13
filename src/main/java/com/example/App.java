package com.example;

/**
 * Hello world!
 *
 */
 
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import com.google.common.collect.ImmutableList;
import java.io.FileWriter;
// ... other imports remain the same

public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String> fruits = ImmutableList.of("Apple", "banana", "cherry");
        System.out.println(fruits);

        // Replace contents of source.txt
        try (FileWriter writer = new FileWriter("source.txt")) {
            writer.write(fruits.toString()); // This writes ["Apple", "banana", "cherry"]
            System.out.println("source.txt updated!");
        } catch (IOException e) {
            System.err.println("Error writing to source.txt: " + e.getMessage());
        }

        // Define source and destination files
        File sourceFile = new File("source.txt");
        File destFile = new File("destination.txt");

        try {
            // Copy file using Apache Commons IO
            FileUtils.copyFile(sourceFile, destFile);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("Error occurred while copying file: " + e.getMessage());
        }
    }
}

