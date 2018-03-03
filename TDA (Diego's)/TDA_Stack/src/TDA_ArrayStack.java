/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class TDA_ArrayStack extends TDA_Stack {

    private Object[] element;
    private int size;
    private int last;

    public TDA_ArrayStack(int size) {
        element = new Object[size];
        this.size = size;
        last = 0;
    }

    @Override
    public void clear(int size) {
        element = new Object[size];
        this.size = size;
    }

    @Override
    public Object top() {
        return element[last];
    }

    @Override
    public Object pop() {
        
        Object aux = element[last];
        element[last] = null;
        last--;
        return aux;
    }

    @Override
    public boolean push(Object ob) {
        if (last + 1 < size) {
            element[last + 1] = ob;
            last++;
            return true;
        }
        return false;

    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }

        return false;
    }

    @Override
    public void print() {
        for (int i = last; i >= 0; i--) {
            System.out.println(i+":"+element[i]);
        }
    }

}
