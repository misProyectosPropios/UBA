package aed;

import java.util.*;

// Todos los tipos de datos "Comparables" tienen el método compareTo()
// elem1.compareTo(elem2) devuelve un entero. Si es mayor a 0, entonces elem1 > elem2
public class ABB<T extends Comparable<T>> implements Conjunto<T> {
    // Agregar atributos privados del Conjunto
    private Nodo root;
    private int set_ammount;
    private class Nodo {
        // Agregar atributos privados del Nodo
        T value;
        Nodo right;
        Nodo left;
        Nodo parent;

        // Crear Constructor del nodo
        public Nodo(T value) {
            this.value = value;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    public ABB() {
        root = null;
        set_ammount = 0;
    }

    public int cardinal() {
        return set_ammount;
    }

    public T minimo(){
        Nodo pointer = this.root;

        while(pointer.left != null) {
            pointer = pointer.left;
        }

        return pointer.value;
    }

    public T maximo(){
        Nodo pointer = this.root;

        while(pointer.right != null) {
            pointer = pointer.right;
        }

        return pointer.value;
    }

    public void insertar(T elem){
        Nodo newNodo = new Nodo(elem);
        Nodo pointer = this.root;
        if (pointer == null) {
            root = newNodo;
            this.set_ammount++;
        }
        if (!this.pertenece(elem)) {
            while(true) {
                if (pointer.value.compareTo(elem) > 0 && pointer.left != null) {
                    pointer = pointer.left;
                } else if (pointer.value.compareTo(elem) <= 0 && pointer.right != null) {
                    pointer = pointer.right;
                } else if (pointer.left == null && pointer.value.compareTo(elem) > 0) {
                    newNodo.parent = pointer;
                    pointer.left = newNodo;
                    break;
                } else {
                    newNodo.parent = pointer;
                    pointer.right = newNodo;
                    break;
                }
            }
            this.set_ammount++;
        }
    }

    public boolean pertenece(T elem){
        Nodo pointer = root;

        boolean res = false;

        while(pointer != null) {
            if (pointer.value.equals(elem)) {
                res = true;
                break;
            }
            if (pointer.value.compareTo(elem) > 0) {
                pointer = pointer.left;
            } else {
                pointer = pointer.right;
            }
        }
        return res;
    }

    public void eliminar(T elem){
        if (this.pertenece(elem)) {
            Nodo pointer = this.root;

            while (!pointer.value.equals(elem)) {
                if (pointer.value.compareTo(elem) > 0) {
                    pointer = pointer.left;
                } else {
                    pointer = pointer.right;
                }
            }
            if (pointer.parent == null) {
                if (pointer.left == null && pointer.right == null) {
                    this.root = null;
                }
                else if (pointer.left != null && pointer.right == null) {
                    this.root = pointer.left;
                    this.root.parent = null;
                }
                else if (pointer.left == null && pointer.right != null) {
                    this.root = pointer.right;
                    this.root.parent = null;
                }
                else if (pointer.left != null && pointer.right != null) {
                    Nodo lessNodo = pointer.right;
                    while (lessNodo.left != null) {
                        lessNodo = lessNodo.left;
                    }

                    //Cambiar los valores
                    Nodo leftPointeNodo = pointer.left;
                    Nodo rigthPointerNodo = pointer.right;
                    Nodo rigthLessValueNodo = lessNodo.right;
                    Nodo parentLessValueNodo = lessNodo.parent;
                    if (parentLessValueNodo.left == lessNodo) {
                        parentLessValueNodo.left = rigthLessValueNodo;
                    } else {
                        parentLessValueNodo.right = rigthLessValueNodo;
                    }

                    if (rigthLessValueNodo != null) {
                        rigthLessValueNodo.parent = parentLessValueNodo;
                    }
                    this.root = lessNodo;
                    this.root.left = leftPointeNodo;
                    this.root.right = rigthPointerNodo;
                    this.root.parent = null;
                }
            }
            else if (pointer.left == null && pointer.right == null) {
                if (pointer.parent.left == pointer) {
                    pointer.parent.left = null;
                } else {
                    pointer.parent.right = null;
                }
            } else if (pointer.left != null && pointer.right == null) {
                if (pointer.parent.left == pointer) {
                    pointer.parent.left = pointer.left;
                    pointer.left.parent = pointer.parent;
                } else {
                    pointer.parent.right = pointer.right;
                    pointer.left.parent = pointer.parent;
                }
            } else if (pointer.left == null && pointer.right != null) {
                if (pointer.parent.left == pointer) {
                    pointer.parent.left = pointer.right;
                    pointer.right.parent = pointer.parent;
                } else {
                    pointer.parent.right = pointer.right;
                    pointer.right.parent = pointer.parent; 
                }
            } else {
                Nodo lessNodo = pointer.right;
                while (lessNodo.left != null) {
                    lessNodo = lessNodo.left;
                }

                //Cambiar los valores
                Nodo leftPointeNodo = pointer.left;
                Nodo rigthPointerNodo = pointer.right;
                Nodo parentPointerNodo = pointer.parent;

                Nodo rigthLessValueNodo = lessNodo.right;
                Nodo parentLessValueNodo = lessNodo.parent;

                if (parentLessValueNodo.left == lessNodo) {
                    parentLessValueNodo.left = lessNodo;
                } else {
                    parentLessValueNodo.right = lessNodo;
                }

                if (rigthLessValueNodo != null) {
                    rigthLessValueNodo.parent = parentLessValueNodo;
                }
/* 
                this.root = lessNodo;
                this.root.left = leftPointeNodo;
                this.root.right = rigthPointerNodo;
                this.root.parent = null; */

                lessNodo.parent = parentPointerNodo;
                lessNodo.left = leftPointeNodo;
                lessNodo.right = leftPointeNodo;

                

                

            }

            //Saco un elemento del set_amount
            this.set_ammount--;
        }
        
    }

    public String toString(){
        throw new UnsupportedOperationException("No implementada aun");
    }

    private class ABB_Iterador implements Iterador<T> {
        private Nodo _actual;

        public boolean haySiguiente() {            
            throw new UnsupportedOperationException("No implementada aun");
        }
    
        public T siguiente() {
            throw new UnsupportedOperationException("No implementada aun");
        }
    }

    public Iterador<T> iterador() {
        return new ABB_Iterador();
    }

}
