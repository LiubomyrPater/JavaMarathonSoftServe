package sprint_4_Generics_Collections.task_3;

import java.util.List;
import java.util.Map;

public class MyUtils {
    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        return map.values().containsAll(list) && list.containsAll(map.values());
    }
}
