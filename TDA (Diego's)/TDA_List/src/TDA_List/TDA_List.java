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
public abstract class TDA_List {
    
    public abstract boolean insert(Object ob , int p);
    public abstract Object get(int p);
    public abstract void eraser(int p);
    public abstract int find(Object object);
    public abstract Object nextTo(int p);
    public abstract Object backTo(int p);
    public abstract void clear(int size);
    public abstract boolean isEmpty();
    public abstract void printList();
    
   
    
}
