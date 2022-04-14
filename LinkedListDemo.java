package com.java.assignments.assignment10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<Integer> sList=new LinkedList<>();
        sList.add(13);
        sList.add(16);
        sList.add(18);
        sList.add(12);
        sList.add(15);

        Iterator<Integer> listItr=sList.iterator();
        while(listItr.hasNext()){
            System.out.println(listItr.next());
        }
    }
}
