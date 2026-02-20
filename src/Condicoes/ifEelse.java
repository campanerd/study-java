package Condicoes;

public class ifEelse {
    static void main() {

        /*
        If e Else - Condicoes
        Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
         */

        // Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        // se (condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunin");
            
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
            
        } else {
            System.out.println("Rank: Genin");
        }
    }
}
