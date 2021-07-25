package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_4;

import java.io.FileReader;
import java.io.IOException;


public class Main_4 {
    public static void main(String[] args) throws IOException{
        System.out.println(readFile("_test.txt"));
    }

    public static String readFile(String filename) {
        StringBuilder result = new StringBuilder();
        char[] oneByte = new char[7];

        try(FileReader fileReader = new FileReader(filename)){
            while (fileReader.read(oneByte, 0, 7) != -1)
                result.append((char) Byte.parseByte(new String(oneByte), 2));
        }catch (IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }
}
