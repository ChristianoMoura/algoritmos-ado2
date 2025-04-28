import javax.swing.JOptionPane;

public class Algoritmos {

    public static void main(String[] args) {

        JOptionPane.showInternalMessageDialog(null, "Bem vindo!!");

        int[] lista = new int[3];
        Leitura(lista);

        int escolha = Menu();

        switch (escolha) {
            case 1:
                //Fibonatti
                break;
            case 2:
                //Fatorial
                break;
            case 3:
                //Fatorial Duplo
                break;
            default:
                JOptionPane.showMessageDialog(null, ("OBRIGADO POR USAR O SISTEMA!"));
        }

    }

    public static int[] Leitura(int[] lista) {

        //Laço para preencher o vetor
        for (int i = 0; i < lista.length; i++) {

            lista[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número "));

        }
        return lista;
    }

    public static int Menu() {

        //Opções do Menu
        String[] opcoes = {"Fibonatti", "Fatorial", "Fatorial Duplo", "Finalizar"};

        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        return escolha + 1;
    }


}

