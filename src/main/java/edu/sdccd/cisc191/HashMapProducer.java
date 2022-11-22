package edu.sdccd.cisc191;

import java.util.HashMap;
public class HashMapProducer {

    // create hashmap container with strings for key and value
    private HashMap<String, String> map;

    // set hashmap container to map
    public HashMapProducer (HashMap<String, String> map)  {
        this.map = map;
    }

    // produces new element with given key and value
    public void produce (String key, String value){
        map.put(key, value);
    }
}
