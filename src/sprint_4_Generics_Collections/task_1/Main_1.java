package sprint_4_Generics_Collections.task_1;

import java.util.HashMap;
import java.util.Map;

public class Main_1 {
    public static void main(String[] args){
        Map<String, String> stringMap = new HashMap<>();

        stringMap.put("0967654321", "Petro");
        stringMap.put("0677654321", "Petro");
        stringMap.put("0501234567", "Ivan");
        stringMap.put("0970011223", null);
        stringMap.put("0631234567", null);

        System.out.println(new MyUtils().createNotebook(stringMap));
    }
}
