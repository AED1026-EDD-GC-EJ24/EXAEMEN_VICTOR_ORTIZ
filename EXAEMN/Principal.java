package EXAEMN;

public class Principal {
    public static void main(String[] args){
        Lista<Integer> lst1=new Lista<>();
        Lista<Integer> lst2=new Lista<>();

        lst1.agregar(1);
        lst1.agregar(2);
        lst1.agregar(3);

        lst2.agregar(4);
        lst2.agregar(5);
        lst2.agregar(6);

        lst1.concaLista(lst2);
        imprimir(lst1);
    }
    public static <T> void imprimir(Lista<T> lista) {
        Lista.Nodo<T> actual = lista.getCabeza();
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
