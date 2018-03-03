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
public class TDA_NodeList extends TDA_List {

    private Node head = null;
    private int size;

    private class Node {

        Object element = null;
        Node next = null;

        Node(Object ob) {
            element = ob;
        }
    }

    @Override
    public boolean insert(Object ob, int p) {
        Node nodo = new Node(ob);
        if (p > size) {
            if (head == null) {
                head = nodo;
            } else {
                Node puntero = head;
                int cont = 0;
                while (cont < p && puntero.next != null) {
                    puntero = puntero.next;
                    cont++;
                }
                nodo.next = puntero.next;
                puntero.next = nodo;
                size++;
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object get(int p) {
        if (head == null) {
            return null;
        } else {
            Node puntero = head;
            int cont = 0;
            while (cont < p && puntero.next != null) {
                puntero = puntero.next;
                cont++;
            }
            if (cont != p) {
                return null;
            } else {
                return puntero.element;
            }
        }

    }

    @Override
    public void eraser(int p) {
        if (head != null) {
            Node puntero = head;
            int cont = 0;
            while (cont < p - 1 && puntero.next != null) {
                puntero = puntero.next;
                cont++;
            }
            // puntero.next = puntero.next.next;
            Node temp = puntero.next;
            puntero.next = temp.next;
            temp = null;
            size--;
        }

    }

    @Override
    public int find(Object object) {
        if (head != null) {
            Node puntero = head;
            int cont = 1;
            while (puntero.next != null) {
                if (puntero.element == object) {
                    return cont;
                } else {
                    cont++;
                }
            }
        }
        return -1;
    }

    @Override
    public Object nextTo(int p) {

        return get(p++);
    }

    @Override
    public Object backTo(int p) {
        return get(p--);
    }

    @Override
    public void clear(int size) {
        head = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    @Override
    public void printList() {
       if (head == null) {
            System.out.println("Vacia");
        } else {
            Node puntero = head;
            int cont = 0;
            while (cont < size && puntero.next != null) {
                System.out.println(puntero.element);
                puntero = puntero.next;
                cont++;
            }
        } 
    }

}
