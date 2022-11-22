package edu.sdccd.cisc191;

import java.util.HashMap;

public class HashMapConsumer {
    // create hashmap container with strings for key and value
    private HashMap<String, String> map;

    // set hashmap container to map
    public HashMapConsumer (HashMap<String, String> map) {
        this.map = map;
    }

    // return string value of key
    public String consume (String string) {
        return map.get(string);
    }
}
