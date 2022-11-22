package edu.sdccd.cisc191;

public class ArrayProducer {

    // create array container
    private String[] array;

    // set ArrayProducer to list
    public ArrayProducer(String[] array ) {
        this.array = array;
    }

    // set element value to given string at index
    public void produce (int index, String string) {
        array[index] = string;

    }
}

