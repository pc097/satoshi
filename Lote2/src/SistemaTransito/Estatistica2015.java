package SistemaTransito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Estatistica2015 {

    public static void main(String[] args) throws IOException {

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Estatística \n1- Cadastro Estatística \n2- Consulta por tipo de veículo \n3- Consulta por quantidade de acidentes \n4- Consltar todas as cidades \n5- Consultar média de acidentes \n9- Finalizar \n\nDigite uma das opções : "));
        Menu.menu(opcao);

    }

    /* 

    Cidades : 5 

    Nomes das cidades : São paulo(código 1), Rio de Janeiro(código 2), Salvador(código 3), 
                        Curitiba(código 4), Porto Alegre(código 5), Florianópolis(código 6),
                        Rio Branco(código 7), Goiânia(código 8), Brasília(código 9),
                        Recife(código 10), Macapá(código 11), Belo Horizonte(código 12,)
                        Fortaleza(código 13), Vitória(código 14), Belém(código 15)
    
    Tipos de veículos : Carro(1), Moto(2), Ônibus(3)    

     */
    //cadastrar :
    static String cadastro() throws IOException {
        Estatistica[] cadastraEstatistica = new Estatistica[15];
        int i;
        String fileName = "RegistroEstatistica2015.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i] = new Estatistica();
        }

        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade : "));
            writer.write(cadastraEstatistica[i].codCidade);
            writer.newLine();
            cadastraEstatistica[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade : ");
            writer.write(cadastraEstatistica[i].nomeCidade);
            writer.newLine();
            cadastraEstatistica[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes : "));
            writer.write(cadastraEstatistica[i].qtdAcidentes);
            writer.newLine();
            cadastraEstatistica[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 tipo de veiculo : "));
            writer.write(cadastraEstatistica[i].tipoVeiculo);
            writer.newLine();
        }
        for (i = 0; i < 15; i++) {
            System.out.println("código da cidade : " + cadastraEstatistica[i].codCidade + " nome da cidade : " + cadastraEstatistica[i].nomeCidade + " quantidade de acidentes : " + cadastraEstatistica[i].qtdAcidentes + " tipo de veiculo : " + cadastraEstatistica[i].tipoVeiculo);
        }
        writer.close();
        System.exit(0);

        return null;

    }

    //consultar por tipo de veículo :
    static void tipo() throws FileNotFoundException, IOException {
        String fileName = "RegistroEstatistica2015.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
    }
}
