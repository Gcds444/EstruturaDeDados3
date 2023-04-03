import java.util.ArrayList;
import java.util.ArrayDeque;

class Main {public static void main (String [] args){

        ArrayList<Integer> lista = new ArrayList<>(5);
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
        ArrayDeque<Integer> fila = new ArrayDeque<>(10);
        int i;

        System.out.println(" 1) Loop inserindo de 1 a 5 na lista");
        for (i = 0; i < 5; i++) {
            lista.add(i+1);
          }

        System.out.println(lista);
        System.out.println("2) Zerando lista");

        while(!lista.isEmpty()) {

            lista.remove(0);
            
            System.out.println(lista);
        }

        System.out.println("2) Loop inserindo de 1 a 5 na pilha");

        for (i = 0; i < 5; i++) {
            pilha.push(i+1);
          }

        System.out.println(pilha);
        System.out.println("3) Zerando pilha");

        pilha.clear();

        System.out.println(pilha);

        System.out.println("3) Loop inserindo infos iguais a pilha na fila com 10 células");

        for (i = 0; i < 10; i++) {
            if (i+1 <= 5) {
                fila.push(i+1);
            } else {
                fila.push(0);
            }
        }

        System.out.println(fila);

        System.out.println("4) Loop inserindo de 6 a 10 na lista");
        for (i = 5; i < 10; i++) {
            lista.add(i+1);
          }

        System.out.println(lista);

        System.out.println("5) Zerando lista");

        while(!lista.isEmpty()) {

            lista.remove(0);
            
            System.out.println(lista);
        }

        System.out.println("5) Loop inserindo de 1 a 5 na pilha");

        for (i = 0; i < 5; i++) {
            pilha.push(i+1);
          }

        System.out.println(pilha);
        System.out.println("5) Zerando pilha");

        pilha.clear();

        System.out.println(pilha);

        System.out.println("5) Loop inserindo infos iguais a pilha na fila com 10 células");

        for (i = 0; i < 10; i++) {
            if (i+1 <= 5) {
                fila.push(i+1);
            } else {
                fila.push(0);
            }
        }
        System.out.println("6) Fila:");
        System.out.println(fila);
    }
}
