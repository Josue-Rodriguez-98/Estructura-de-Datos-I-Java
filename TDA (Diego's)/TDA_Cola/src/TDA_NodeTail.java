/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class TDA_NodeTail extends TDA_Tail {

   private Node cabeza = null;
   private Node fin = cabeza;

    public class Node {

        public Object element;
        public Node next = null;

        Node(Object object) {
            Object element = object;
            Node next = null;
        }
    }

    @Override
    public void clear(int size) {
        cabeza = null;
        fin = cabeza;
    }

    @Override
    public Object front() {
        return cabeza.element;
    }

    @Override
    public boolean enqueue(Object object) {
        if (cabeza == null) {
            Node node = new Node(object);
            cabeza = node;
            fin = cabeza;
            cabeza.next = fin;

        } else {
            Node node = new Node(object);
            fin.next = node;
            fin = node;

        }
        return true;
    }

    @Override
    public Object dequeue() {
        Node aux = cabeza;
        cabeza = cabeza.next;

        return cabeza.element;
    }

    @Override
    public boolean isEmpty() {
        if (cabeza == null) {
            return true;
        }
        return false;
    }

    @Override
    public void print() {
        if (cabeza == null) {
            System.out.println("Vacia");
        } else {
            Node puntero = cabeza;

            while (puntero.next != null) {
                System.out.println(puntero.element);
                puntero = puntero.next;

            }
        }

    }

}
