package edu.sdccd.cisc191;

import java.util.HashSet;
public class HashSetProducer {

    // create hashset container
    private HashSet<String> set;

    // set HashSet to set, pass into program
    public HashSetProducer (HashSet<String> set) {
        this.set = set;
    }

    // adds string element if string doesn't
    // already exist in hashset
    public boolean produce (String string){
        return set.add(string);
    }
}
