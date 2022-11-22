package edu.sdccd.cisc191;

import java.util.HashSet;
public class HashSetConsumer {

    // create hashset container
    private HashSet<String> set;

    // set hashset container to set
    public HashSetConsumer (HashSet<String> set) {
        this.set = set;
    }

    // if boolean is true, remove string from hashset
    public boolean consume (String string) {
        return set.remove(string);
    }

}
