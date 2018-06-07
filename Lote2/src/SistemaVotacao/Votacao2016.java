package SistemaVotacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Votacao2016 {

    public static int numeroAleatorio(int a, int b) {
        final int min = Math.min(a, b);
        final int max = Math.max(a, b);

        return min + (int) (Math.random() * ((max - min) + 1));
    }

    static int i;
    static String fileName = "Votacao2016.txt";
    static Votacao[] cadastraVotacao = new Votacao[300];

    public static void main(String[] args) throws IOException {
        Menu.menu();
    }

    static void cadastrar() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        for (i = 0; i < 100; i++) {
            cadastraVotacao[i] = new Votacao();
        }
        for (i = 0; i < 100; i++) {
            cadastraVotacao[i].numeroCandidato = numeroAleatorio(0, 300);
            writer.write(Integer.toString(cadastraVotacao[i].numeroCandidato));
            writer.newLine();
            cadastraVotacao[i].numeroSecao = numeroAleatorio(0, 10);
            writer.write(Integer.toString(cadastraVotacao[i].numeroSecao));
            writer.newLine();
        }
        for (i = 0; i < 100; i++) {
            int j = i + 1;
            System.out.println("Voto " + j + "\nSeção : " + cadastraVotacao[i].numeroSecao + "\nCandidato : " + cadastraVotacao[i].numeroCandidato + "\n");
        }

        writer.close();
        System.exit(0);
    }

    static void classificar() throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

    }
}
