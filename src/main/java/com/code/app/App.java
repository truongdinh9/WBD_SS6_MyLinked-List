package com.code.app;

import com.code.MyList;
import com.code.Node;

public class App {
    public static void main(String[] args) {
        MyList<String> myList =new MyList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add(1,"E");
        myList.add(1,"F");
        System.out.println("Size: "+ myList.size());
        System.out.println(myList);
        myList.remove(2);
        System.out.println(myList);


    }

}
