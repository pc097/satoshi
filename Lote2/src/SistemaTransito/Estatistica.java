package SistemaTransito;

public class Estatistica {

    String nomeCidade;
    int codCidade;
    int qtdAcidentes;
    int tipoVeiculo;

    Estatistica() {
        this("", 0, 0, 0);
    }

    Estatistica(String nomecidadeEstatistica, int codcidadeestatistica ,int qtdacidentesEstatistica, int tipoveiculoEstatistica) {
        nomeCidade = nomecidadeEstatistica;
        codCidade = codcidadeestatistica;
        qtdAcidentes = qtdacidentesEstatistica;
        tipoVeiculo = tipoveiculoEstatistica;
    }
}
