package EXAEMN;

public class Lista<T>{
    private Nodo<T> cabeza;
    static class Nodo<T>{
        T dato;
        Nodo<T> siguiente;

        public Nodo(T dato){
            this.dato=dato;
        }

        public char[] getDato() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getDato'");
        }

        public Nodo<T> getSiguiente() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getSiguiente'");
        }
    }
    public void agregar(T dato){
        Nodo<T> nuevoNodo=new Nodo<>(dato);
        nuevoNodo.siguiente=cabeza;
        cabeza=nuevoNodo;
    }
    public void concaLista(Lista<T> lst2){
        if(cabeza==null){
            cabeza=lst2.cabeza;
        }else{
            Nodo<T> actual=cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = lst2.cabeza;
     }
    
    }
    public Nodo<T> getCabeza() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCabeza'");
    }
}