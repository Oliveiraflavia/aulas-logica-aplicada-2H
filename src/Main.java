public class Main {
    public static void main(String[] args) {
       int contador = 0;

       // Laço para enquanto
       while(contador < 10){
           System.out.println("Contador = " + contador);
           //Incremento = alterar o valor para o laço evoluir
           contador = contador + 1;
       }

       // Laço para faça
        for (int x=0; x < 10; x++){
            System.out.println("Contador = " + x);
            // Laço para faça  enquanto
            int cont = 1;
            do {

                // processo
                System.out.println(cont);
            }while(cont <= 1);
        }
    }
}