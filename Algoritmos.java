import javax.swing.JOptionPane;

public class Algoritmos {

    public static void main(String[] args) {

        JOptionPane.showInternalMessageDialog(null, "Bem vindo!!");

        int escolha = Menu();

        int n = 0;
        int n2 = 0;
        int n3 = 0;

        switch (escolha) {
            case 1:
                    n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número "));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número "));
                    n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número "));

                Fibonacci(n, n2, n3);
                break;
            case 2:
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número "));
                Fatorial(n);
                break;
            case 3:
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número "));
                FatorialDuplo(n);
                break;
            default:
                JOptionPane.showMessageDialog(null, ("OBRIGADO POR USAR O SISTEMA!"));
        }

    }

    public static int Menu() {

        //Opções do Menu
        String[] opcoes = {"Fibonacci", "Fatorial", "Fatorial Duplo", "Finalizar"};

        int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        return escolha + 1;
    }

    public static void Fibonacci(int pen, int ult, int n) {

        // Caso base - Quando n é igual a 0
        if (n == 0) {
            return;
        }

        int fibo;

        if (pen == 0 && ult == 0) {
            fibo = 0;
            pen = 0;
            ult = 1;
        } else {

            fibo = pen + ult;
            pen = ult;
            ult = fibo;
        }

        JOptionPane.showMessageDialog(null, fibo + " ");

        Fibonacci(pen, ult, n - 1);
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


