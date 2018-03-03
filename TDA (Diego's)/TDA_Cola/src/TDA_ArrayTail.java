/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class TDA_ArrayTail extends TDA_Tail {

    private Object[] element;
    private int elements = 0;
    private int size = 0;
    private int start = 0;
    private int end = start + 1;

    public TDA_ArrayTail(int size) {
        element = new Object[size];
        this.size = size;
    }

    @Override
    public void clear(int size) {
        element = new Object[size];
        this.size = size;
        elements = 0;
    }

    @Override
    public Object front() {

        return element[start];
    }

    @Override
    public boolean enqueue(Object object) {
        if (elements < size) {//Si la cola no esta llena
            element[end] = object;//Inserta el elemento en la final de la cola
            end++;
            elements++;

            if (end == size) {
                end = 0;
                element[end] = object;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object dequeue() {
        if (elements != 0) {
            Object aux = element[start];
            element[start] = null;
            elements--;

            if (start + 1 < size) {
                start++;
            } else {
                start = 0;
            }
            return aux;
        }

        return null;

    }

    @Override
    public boolean isEmpty() {
        if (elements == 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void print() {
        int pos = start;
        for (int i = 0; i < elements; i++) {
                if(pos < elements){
                    System.out.println(pos+" "+ element[pos]);
                    pos++;
                }else{
                    pos = 0;
                    System.out.println(pos+" "+ element[pos]);
                }
        }
    }

}
