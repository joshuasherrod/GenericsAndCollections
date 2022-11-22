package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer
{
    // create arraylist container
    private ArrayList<String> list;

    // set ArrayList to list
    public ArrayListConsumer(ArrayList<String> list) {
        this.list = list;
    }

    // remove element at given index
    public String consume() {
        return (String) list.remove(0);
    }
}