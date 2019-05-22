package com.mac.rag;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class HashMapPgm {
    public static void main(String args[]) {
        Map myMap = new HashMap();
        for (int i = 1; i < 26; i++) {
            myMap.put(i, i);
            System.out.println(i + " = " + getMapCapacity(myMap));
        }
    }



    private static int getMapCapacity(Map myMap) {
        try {
            Field tableField = HashMap.class.getDeclaredField("table");
            tableField.setAccessible(true);
            Object[] table = (Object[]) tableField.get(myMap);
            return table == null ? 0 : table.length;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
