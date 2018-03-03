/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt_list;

/**
 *
 * @author Josue Rodriguez
 */
public class myList implements List {

    private int size;
    private Object list[];//array of list items
    private int MAX = 0;//Max quantity of items the list supports

    myList(int m) {
        MAX = m;
        list = new Object[m];
        size = 0;
        //availPos = 1;
    }

    @Override
    public int getSize() {//Correct
        return size;
    }

    @Override
    public boolean insert(int pos, Object data) {//Correct
        if (size == MAX) {
            System.out.println("**la lista esta llena**");
        } else if (pos > MAX || pos < 0) {
            System.out.println("**posicion no valida**");
        } else {
            for (int i = MAX - 2; i > pos; i--) {
                list[i + 1] = list[i];
            }
            size++;
            list[pos] = data;
            return true;
        }
        return false;

    }

    @Override
    public boolean insertBack(Object data) {//Correct
        if (size == MAX) {
            System.out.println("**la lista esta llena**");
            return false;
        } else {
            list[size] = data;
            size++;
            return true;
        }

    }

    @Override
    public int find(Object data) {//Correct
        for (int i = 0; i <= size; i++) {
            if (list[i] == data) {
                return i + 1;
            }
        }
        return -1;
    }

    @Override
    public Object get(int pos) {//Correct
        if (pos - 1 >= 0 && pos - 1 < MAX) {
            return list[pos - 1];
        } else {
            return null;
        }
    }

    @Override
    public boolean erase(int pos) {//Correct
        if (pos-1 >= 0 && pos-1 < MAX) {
            list[pos-1] = null;
            for (int i = pos; i < size; i++) {
                list[i-1] = list[i];
            }
            size--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object next(int pos) {//Correct
        return get(pos);
    }

    @Override
    public void clear() {//Corect
        list = new Object[MAX];
        size = 0;
    }

    @Override
    public Object first() {//Correct
        return list[0];
    }

    @Override
    public void print() {//Correct
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

}
