package Oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {

    private int[] data; // we don't people to directly change the data present in the array, we want
                        // them to use the getter and setter method to modify data, that's why its
                        // private
    private int DEFUALT_SIZE;
    private int size = 0;

    public CustomArraylist(int Default) {
        DEFUALT_SIZE=Default;
        this.data = new int[DEFUALT_SIZE];
    }

    private boolean isfull() {
        return size == data.length;
    }

    public void add(int num) {
        if (this.isfull()) {
            this.resize();
        }
        data[size++] = num;
    }

    private void resize() {
        // if the array is full then the new array will be double the size of the
        // previous one....
        int[] temp = new int[data.length * 2];

        // copying the data of the previous one into the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        // assign the new array object to the old one
        data = temp;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    // public void print(){
    //     for (int i = 0; i < data.length; i++) {
    //         System.out.printf("[%d,]",data[i]);
    //     }
    // }

    public static void main(String[] args) {
        CustomArraylist List= new CustomArraylist(5);
        List.add(50);
        List.add(40);
        System.out.println(List);
    }
}
