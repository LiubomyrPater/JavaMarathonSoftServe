package sprint_4_Generics_Collections.task_1;

import java.util.*;

public class MyUtils {

/**
 Create a createNotebook() method of the App class to create a new map with name as key and phone list as value.
 The method receives a map with phone as key and name as value.


 For example, for a given map
 {0967654321=Petro, 0677654321=Petro, 0501234567=Ivan, 0970011223=Stepan, 0631234567=Ivan}

 you should get
 {Ivan=[0501234567, 0631234567], Petro=[0967654321, 0677654321], Stepan=[0970011223]}
 */
    public Map<String, List<String>> createNotebook(Map<String, String> phones){
        return new HashMap<String, List<String>>(){{
            for (String s : phones.values())
                put(s, new ArrayList<String>() {{
                    for (Entry<String, String> i : phones.entrySet())
                        if (s == null && i.getValue() == null || i.getValue() != null && i.getValue().equals(s))
                            add(i.getKey());
                }});
        }};
    }
}
