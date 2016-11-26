package runners2016v2;

import java.util.Scanner;

public class Runners2016V2 {
    
    private static final int NUM_SOCIOS = 100;
    private static final int NUM_PROVAS = 5;
    /**
     * numero de campos da matriz socios
     */
    private static final int NUM_CAMPOS = 4;
    /**
     * recebe o diretório onde está atualmente
     */
    private static final String CURR_DIRECTORY = System.getProperty("user.dir");
    
    /**
     * Scanner para ler opções e entradas do utilizador
     */
    static Scanner scan = new Scanner(System.in);

    public static void menu(){
        System.out.printf("1 - Ler um ficheiro de socios\n"
                + "2 - Mostrar informacao sobre atletas\n"
                + "3 - Modificar um campo de um atleta\n"
                + "4 - Ler inscricoes\n"
                + "5 - Ler ficheiro de uma prova\n"
                + "6 - Mostrar / guardar todas as informacoes\n"
                + "7 - Limpar todos os dados"
                + "8 - Mostrar atletas melhores/piores que a média de uma prova\n"
                + "9 - Mostrar percentagem de mulheres e desistencias de uma prova\n"
                + "10 - Criar ficheiro formatado com nome - idade - media de tempo\n"
                + "11 - Mostrar vencedor de uma prova\n");//Supostamente este sai para o teste
        switch(scan.nextInt()){
            case 1:
                //TODO ler nome do ficheiro dos atletas
                break;
            case 2:
                //TODO ver informacao introduzida sobre os atletas
                break;
            case 3:
                //TODO alterar campo de um atleta
                break;
            case 4:
                //TODO ler inscrições e preparar a matriz tempos 
                break;
            case 5:
                //TODO ler tempos de uma prova e introduzir na matriz tempos
                break;
            case 6:
                //TODO (escolher) mostrar ou guardar dados em ficheiros da matriz tempos e atletas
                break;
            case 7:
                //TODO limpar todos os dados
                break;
            case 8:
                //TODO mostrar uma determinada prova os atletas com tempo melhor que a média os piores
                break;
            case 9:
                //TODO para cada prova mostrar percentagem de mulheres e a percentagem de 0s
                break;
            case 10:
                //TODO criar um ficheiro formatado com o 1 nome e ultimo 
                //a idade decrescente as provas e tempo medio para cada um
                break;
            case 11:
                //TODO mostrar vencedor de uma prova
                break;
            default:
                System.out.println("Opcao nao reconhecida");
                menu();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[][] socios = new String[NUM_SOCIOS][NUM_CAMPOS];
        String[][] tempos = new String[NUM_SOCIOS][NUM_PROVAS];
    }

}
