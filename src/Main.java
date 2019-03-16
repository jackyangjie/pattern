import pattern.sigletion.lazy.LazyInnerClassSinleton;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        block(9,2);

    }

    public static void block(int a,int blockNum){
        int r = a/blockNum*blockNum;
        System.out.println(r);
        Map<String,String> map = new HashMap<String,String>();
        map.put("a","b");
    }

}
