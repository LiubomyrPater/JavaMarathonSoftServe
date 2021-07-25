package sprint_7_Stream_API_Date_and_Time_I_O_Streams.task_3;

import java.io.*;

/**
 *
 Create the method writeFile(String filename, String text) that write the text to file as sequence of bytes in binary format.

 For example, the text fragment: "Hello!"

 should be represented in the file as a sequence of 7-bit bytes without spaces between them:

 If less than 7 bits are required to represent the character then add to binary sequence leading zeros '0'.
 */
public class Main_3 {
    public static void main(String[] args){
        writeFile("_test.txt", "Hello!");
    }

    public static void writeFile(String filename, String text) {
        try (FileWriter fileWriter = new FileWriter(filename)){
            for (int i : text.toCharArray()) {
                StringBuilder singleValue = new StringBuilder(Integer.toBinaryString(i));
                while (singleValue.length() < 7) singleValue.insert(0, 0);
                fileWriter.write(singleValue.toString());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
