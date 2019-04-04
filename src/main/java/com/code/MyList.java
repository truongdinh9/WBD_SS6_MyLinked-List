package com.code;

public class MyList<E> implements List {
    Node Head;
    Node Tail;
    public int Count;

    public MyList() {
    }

    @Override
    public void add(int index,Object e) {
        if (index < 0 || index > Count) {
            throw new IndexOutOfBoundsException(" index must >=0 and <=size ");
        }else {
        if (index==0) {
            addFist(e);
        }else if (index==Count){
            add(e);
        } else {
            Node temp = Head;
            for (int i = 0; i < index-1; i++) {
                temp=temp.next;
            }
            Node newNode=new Node(e);
            newNode.next=temp.next;
            temp.next=newNode;


        }
            Count++;
    }
    }

    public void add(Object e) {
        if (Head == null) {
            Head = new Node(e);
            Tail = Head;
        } else{
            Tail.next = new Node(e);
            Tail = Tail.next;
        }
        Count++;
    }
    public void addFist(Object e){
        if (Head == null) {
            Head = new Node(e);
            Tail = Head;
        } else {
            Node temp = Head;
            Head=new Node(e);
            Head.next=temp;
        }
        Count++;
    }


    @Override
    public E get(int index) {
        if (index < 0 || index >= Count) {
            throw new IndexOutOfBoundsException(" index must >0 and <size ");
        } else {
            Node temp = Head;
            for (int i = 0; i < index && temp.next != null; i++) {
                temp = temp.next;
            }
            return (E) temp.getValue();
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= Count) {
            throw new IndexOutOfBoundsException(" index must >0 and <size ");
        } else {
            Node temp = Head;

            for (int i = 0; i < index - 1 && i < Count - 1; i++) {
                temp = temp.next;
            }
            if (index == Count - 1) {
                temp.next = null;
            } else {
                temp.next = temp.next.next;
            }
            Count--;
        }

    }

    @Override
    public int size() {
        return Count;
    }

    @Override
    public String toString() {
       String e = "Mylist :"+"\r\n";
        for (int i=0;i<size();i++) {
          e+=i+ ". "+ get(i).toString()+ "\r\n";
        }
        return e;
    }
}
