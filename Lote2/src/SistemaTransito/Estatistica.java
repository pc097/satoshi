package SistemaTransito;

public class Estatistica {

    int codCidade;
    String nomeCidade;
    int qtdAcidentes;
    int tipoVeiculo;

    Estatistica() {
        this(0, "", 0, 0);
    }

    Estatistica(int codcidadeestatistica, String nomecidadeEstatistica, int qtdacidentesEstatistica, int tipoveiculoEstatistica) {
        codCidade = codcidadeestatistica;
        nomeCidade = nomecidadeEstatistica;
        qtdAcidentes = qtdacidentesEstatistica;
        tipoVeiculo = tipoveiculoEstatistica;
    }
}
