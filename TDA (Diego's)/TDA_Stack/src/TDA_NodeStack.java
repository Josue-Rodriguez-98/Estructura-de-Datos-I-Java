/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class TDA_NodeStack extends TDA_Stack {

    private Node head = null;
    private int size = 0;

    private class Node {

        Object element = null;
        Node next = null;

        public Node(Object element) {
            this.element = element;
        }
    }

    @Override
    public void clear(int size) {
        head = null;
    }

    @Override
    public Object top() {
        return head.element;
    }

    @Override
    public Object pop() {
        Node aux = head;
        head = head.next;
        head.next = null;
        return aux.element;
    }

    @Override
    public boolean push(Object ob) {
        Node aux = new Node(ob);
        aux.next = head;
        head = aux;
        return true;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }

        return false;
    }

    @Override
    public void print() {
      
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
