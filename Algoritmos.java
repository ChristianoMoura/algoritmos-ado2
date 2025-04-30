import javax.swing.JOptionPane;

public class Algoritmos {

    public static void main(String[] args) {

        JOptionPane.showInternalMessageDialog(null, "Bem vindo!!");

        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número "));

        int escolha = Menu();

        switch (escolha) {
            case 1:
                //Fibonatti
                break;
            case 2:
                Fatorial(n);
                break;
            case 3:
                FatorialDuplo(n);
                break;
            default:
                JOptionPane.showMessageDialog(null, ("OBRIGADO POR USAR O SISTEMA!"));
        }

    }

    public static int Menu() {

        //Opções do Menu
        String[] opcoes = {"Fibonatti", "Fatorial", "Fatorial Duplo", "Finalizar"};

        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        return escolha + 1;
    }

    public static void Fatorial (int n) {

        int fat = 1;

        for (int i = 1; i <= n; i++) {
            // Multiplica o valor do fat pelo o i e armazena
            fat *= i;
        }
        JOptionPane.showMessageDialog(null, "O valor do fatorial é "+fat);
    }

    public static void FatorialDuplo (int n) {

        int fat = 1;

        // O i irá diminuir em 2 a cada repetição do laço abaixo
        for (int i = n; i >= 1; i -= 2) {
            fat *= i;
        }
        JOptionPane.showMessageDialog(null, "O valor do fatorial duplo é "+fat);
    }
}


