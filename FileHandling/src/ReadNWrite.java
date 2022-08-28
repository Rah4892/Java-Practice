import java.io.*;

public class ReadNWrite {
    public static void main(String[] args) throws IOException {
        File file = new File("JavaFile.txt");
        FileWriter writer = new FileWriter(file);
        writer.write("This is a test string to file.");
        writer.write("\n");
        writer.write("Adding another line to the file.");

        if (file.exists()) {
            String path = file.getPath();
            String path2 = file.getAbsolutePath();

            System.out.println(path);
            System.out.println(path2);
        }

        writer.close();

        //reading the contents of the file
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while((line = bufferedReader.readLine()) != null) {
            //line = bufferedReader.readLine();
            System.out.println(line);
        }

        //CSV reader in Java


    }

}
