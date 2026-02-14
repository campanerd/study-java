package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {

    /*
    Dados primitivos - int, double, float, char, boolean, short
    objetivo da aula: criar um ninja - Naruto
     */

        int idade = 16;
        double altura = 1.75;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 99999L; //valor para long é com limite mto maior - sempre escrever com L maiúsculo

        System.out.println(idade); // comando para mostrar o usuário
        System.out.println(saldoBancario);
        System.out.println(inicial);
        System.out.println("saldo Bancario é = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
    }
}
