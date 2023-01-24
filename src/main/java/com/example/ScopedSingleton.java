package com.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ScopedSingleton {

    private static Map<String, ScopedSingleton> instanceMap = new HashMap<>();

    private boolean completed = false;

    private ScopedSingleton() {

    }

    public static ScopedSingleton getInstance(String scopeName) {

        if (Objects.isNull(instanceMap.get(scopeName))) {
            instanceMap.put(scopeName, new ScopedSingleton());
        }

        return instanceMap.get(scopeName);
    }

    public static void dropInstance(String scopeName) {

        if (!Objects.isNull(instanceMap.get(scopeName))) {
            instanceMap.remove(scopeName) ;
        }

    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    public boolean getCompleted(){
        return this.completed;
    }


}
