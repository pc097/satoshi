package SistemaVotacao;

import javax.swing.JOptionPane;

public class Votacao {

    int numeroSecao;
    int numeroCandidato;

    Votacao() {
        this(0, 0);
    }

    Votacao(int nosecaoVotacao, int nocandidatoVotacao) {
        numeroSecao = nosecaoVotacao;
        numeroCandidato = nocandidatoVotacao;
    }
}
