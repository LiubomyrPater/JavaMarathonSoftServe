package sprint_4_Generics_Collections.task_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main_3 {
    public static void main(String[] args){

        List<String> strings = new ArrayList<>();
        strings.add("aa");
        strings.add("bb");
        strings.add("aa");
        strings.add("cc");
        strings.add("cl");

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1", "cc");
        stringMap.put("2", "bb");
        stringMap.put("3", "cc");
        stringMap.put("4", "aa");
        stringMap.put("5", "cc");

        System.out.println(new MyUtils().listMapCompare(strings, stringMap));
    }
}
