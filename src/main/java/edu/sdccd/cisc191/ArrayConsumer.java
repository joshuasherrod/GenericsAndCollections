package edu.sdccd.cisc191;

public class ArrayConsumer {
    // string container
    private String[] array;
    int index = 0;


    // set string container to string we're using
    public ArrayConsumer(String[] array) {
        this.array = array;
    }

    // method to consume at index, return
    public String consume () {
        String remove = "";
        if (index < array.length) {
            remove = array[index];
            index++;
        }
        return remove;
    }
}
