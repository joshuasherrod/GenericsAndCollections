package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListProducer {

    // create arraylist container
    private ArrayList<String> list;

    // set ArrayListProducer list to list
    public ArrayListProducer(ArrayList<String> list)
    {
        this.list = list;
    }

    // add string value at given index to list
    public void produce(int i, String string)
    {
        list.add(i, string);
    }

}