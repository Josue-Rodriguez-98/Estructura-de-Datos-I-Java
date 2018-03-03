/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDA_List;

/**
 *
 * @author Diego
 */
public class TDA_ArrayList extends TDA_List {

    private int size;
    private Object[] list;

    @Override
    public boolean insert(Object ob, int p) {
        if (p - 1 < list.length && p - 1 >= 0) {
            list[p - 1] = ob;
            size++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object get(int p) {
        if (p - 1 < list.length && p - 1 >= 0) {
            return list[p - 1];
        } else {
            return null;
        }
    }

    @Override
    public void eraser(int p) {
        if (p - 1 < list.length && p - 1 >= 0) {
            list[p - 1] = null;
            for (int i = p; i < size; i++) {
                if (i != size) {
                    list[i - 1] = list[i];
                    list[i] = null;
                }
            }
            size--;
        }
    }

    @Override
    public int find(Object object) {
        for (int i = 0; i < size; i++) {
            if (object == list[i]) {
                return i + 1;
            }
        }
        return -1;
    }

    @Override
    public Object nextTo(int p) {
        if (p + 1 < size || p + 1 >= 0) {
            return null;
        } else {
            return list[p + 1];
        }
    }

    @Override
    public Object backTo(int p) {
        if (p - 1 > size || p - 1 < 0) {
            return null;
        } else {
            return list[p - 1];
        }
    }

    @Override
    public void clear(int size) {
        list = new Object[size];
        size = this.size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println(i + " " + list[i]);
        }
    }

}
