package pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Leader {

    private static Map<String,IEmptyee> emptyeeMap = new HashMap();

    static {
        emptyeeMap.put("A",new AEmptyee());
        emptyeeMap.put("B",new BEmptyee());
    }

    public String  task(String commed){
        System.out.println("leader:好！我去安排");
        String reusltA = emptyeeMap.get("A").skill("后台");
        String reusltB = emptyeeMap.get("B").skill("页面");
        if("完成".equals(reusltA) && "完成".equals(reusltB)){
         return "老板 网站做好了！";
        }
      return "老板 还差一点！";
    }

}
