package TiposDeDados;

public class Exer1 {
    static void main() {
        //ninja1
        String ninja1nome = "Sasuke Uchiha";
        int ninja1idade = 14;
        String missao1 = "matar o Itachi";
        String statusdaMissao1 = "Em andamento";
        char nivelmissao1 = 'S';
        System.out.println("Nome do Ninja1: " + ninja1nome);
        System.out.println("Idade do " + ninja1nome +" : " + ninja1idade);
        System.out.println("Missão do Ninja1: " + missao1);
        System.out.println("Status da Missão do Ninja1: " + statusdaMissao1);
        System.out.println("Nível da Missão do Ninja1: " + nivelmissao1);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");


        // verificar nivel da missao e idade do ninja
        if (ninja1idade < 15) {
            if (nivelmissao1 == 'C' || nivelmissao1 == 'D') {
                statusdaMissao1 = "Concluida";
            } else {
                statusdaMissao1 = "Não concluída";
            }


        }else {
            statusdaMissao1 = "Concluída";
        }
        System.out.println(statusdaMissao1);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");


        //ninja2
        String ninja2nome = "Sakura Haruno";
        int ninja2idade = 18;
        String missao2 = "tentar ser util";
        String statusdaMissao2 = "Incompleta";
        char nivelmissao2 = 'A';
        System.out.println("Nome do Ninja2: " + ninja2nome);
        System.out.println("Idade da " + ninja2nome +" : " + ninja2idade);
        System.out.println("Missão do Ninja2: " + missao2);
        System.out.println("Status da Missão do Ninja2: " + statusdaMissao2);
        System.out.println("Nível da Missão do Ninja2: " + nivelmissao2);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");


        //ninja3
        String ninja3nome = "Minato Namikaze";
        int ninja3idade = 27;
        String missao3 = "Selar Kurama";
        String statusdaMissao3 = "Completa";
        char nivelmissao3 = 'S';
        System.out.println("Nome do Ninja3: " + ninja3nome);
        System.out.println("Idade do " + ninja3nome +" : " + ninja3idade);
        System.out.println("Missão do Ninja3: " + missao3);
        System.out.println("Status da Missão do Ninja3: " + statusdaMissao3);
        System.out.println("Nível da Missão do Ninja3: " + nivelmissao3);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");












    }
}
