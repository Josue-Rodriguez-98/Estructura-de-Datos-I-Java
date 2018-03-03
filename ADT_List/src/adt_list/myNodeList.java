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
public class myNodeList implements List {

    private Node head = null;
    private int size;

    private class Node {

        Object info = null;
        Node next = null;
        Node previous = null;

        Node(Object data) {
            info = data;
        }
    }
    
    myNodeList(){
        
    }
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean insert(int pos, Object data) {
        if (pos - 1 >= size || pos - 1 < 0) {
            return false;
        } else {
            Node aux = head;
            int cont = 0;
            while (cont < pos) {
                cont++;
                aux = aux.next;
            }
            Node temp = new Node(data);
            temp.previous = aux.previous;
            temp.next = aux;
            aux.previous = temp;
            size++;
            return true;
        }
    }

    @Override
    public boolean insertBack(Object data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int find(Object data) {
        if(head!=null){
            Node aux = head;
            int cont = 1;
            while(aux.next!=null){
                if(aux.info == data){
                    return cont;
                }else{
                    cont++;
                }
            }
        }
        return -1;
    }

    @Override
    public Object get(int pos) {
        if (head == null) {
            return null;
        } else {
            Node aux = head;
            int cont = 0;
            while (cont < pos) {
                cont++;
                aux = aux.next;
            }
            return aux.info;
        }
    }

    @Override
    public boolean erase(int pos) {
        if (head != null) {
            Node aux = head;
            int cont = 0;
            while(cont < pos -1 && aux.next!= null){
                cont++;
                aux = aux.next;
            }
            aux.previous.next = aux.next;
            aux.next.previous = aux.previous;
            size--;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next(int pos) {
        return get(pos);
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public Object first() {
        if (head!=null) {
            return head.info;
        }else{
            return null;
        }
    }

    @Override
    public void print() {
        Node aux = head;
        while(aux!=null){
            System.out.print(aux.info + " ");
            aux = aux.next;
        }
    }

}
