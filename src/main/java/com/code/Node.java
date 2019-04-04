package com.code;

public class Node {
    Node next;
    private Object value;

    public void setValue(Object value) {
        this.value = value;
    }

    public Node(Object val) {
        value = val;
    }
    Object getValue (){
        return value;
    }
}
