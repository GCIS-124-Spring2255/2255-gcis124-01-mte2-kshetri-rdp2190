// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;

//public class MyDeque {
public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    public MyDeque() {    list = new LinkedList<>();    }

    // ... for enqueueFront ...
    @Override
    public void enqueueFront(E element) {
        list.add(0,element);
    }
    // ... for enqueueBack ...
    @Override
    public void enqueueBack(E element){
        list.add(list.size()-1,element);
    }
    // ... for dequeueFront ...
    @Override
    public E dequeueFront(){
        
    }
    // ... for dequeueBack ... 
    @Override
    public E dequeBack(){

    }
    // ... for size ...
    public int size(){
        return list.size();
    }
    // ... for iterator ...
    public Iterator<E> iterator(){

    }

    public static void main(String[] args) { 

        // ...
    }
}