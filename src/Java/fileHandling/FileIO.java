package Java.fileHandling;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        // write a file
        String[] names = {"Darmila", "Sana", "Ram"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\darmi\\Desktop\\Java\\Java\\src\\Java\\fileHandling\\Output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nnext line.");
            for(String s : names){
                writer.write("\n" + s);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Read a file
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\darmi\\Desktop\\Java\\Java\\src\\Java\\fileHandling\\Output.txt"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Read csv file
        // csv - Comma-Separated Values
        String file = "C:\\Users\\darmi\\Desktop\\Java\\Java\\src\\Java\\fileHandling\\file1csv.csv";
        BufferedReader r = null;
        String line = "";
        try{
            r = new BufferedReader(new FileReader(file));
            while((line = r.readLine()) != null){
                String[] row = line.split(",");
                for(String index : row){
                    System.out.printf("%-10s", index);
                }
            }
            r.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
