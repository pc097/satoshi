package SistemaTransito;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Estatistica2015 {

    static Estatistica[] cadastraEstatistica = new Estatistica[15];

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
        int i;
        String fileName = "RegistroEstatistica2015.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i] = new Estatistica();
        }

        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade : ");
            writer.write(cadastraEstatistica[i].nomeCidade);
            writer.newLine();
            cadastraEstatistica[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade : "));
            writer.write(Integer.toString(cadastraEstatistica[i].codCidade));
            writer.newLine();
            cadastraEstatistica[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quatidade de acidentes : "));
            writer.write(Integer.toString(cadastraEstatistica[i].qtdAcidentes));
            writer.newLine();
            cadastraEstatistica[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de veiculo : "));
            writer.write(Integer.toString(cadastraEstatistica[i].tipoVeiculo));
            writer.newLine();
        }
        for (i = 0; i < 15; i++) {
            System.out.println(" nome da cidade : " + cadastraEstatistica[i].nomeCidade + "código da cidade : " + cadastraEstatistica[i].codCidade + " quantidade de acidentes : " + cadastraEstatistica[i].qtdAcidentes + " tipo de veiculo : " + cadastraEstatistica[i].tipoVeiculo);
        }
        writer.close();
        System.exit(0);

        return null;

    }

    //consultar por nome da cidade :
    static void nome() throws FileNotFoundException, IOException {
        int i;
        String j = JOptionPane.showInputDialog("Digite o nome da cidade : ");
        String fileName = "RegistroEstatistica2015.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i] = new Estatistica();
        }
        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i].nomeCidade = reader.readLine();
            cadastraEstatistica[i].codCidade = Integer.parseInt(reader.readLine());
            cadastraEstatistica[i].qtdAcidentes = Integer.parseInt(reader.readLine());
            cadastraEstatistica[i].tipoVeiculo = Integer.parseInt(reader.readLine());

        }
        for (i = 0; i < 15; i++) {
            if (j.equals(cadastraEstatistica[i].nomeCidade)) {
                System.out.println("Registro" + " : " + cadastraEstatistica[i].nomeCidade + "(código " + cadastraEstatistica[i].codCidade + ") registrou " + cadastraEstatistica[i].qtdAcidentes + " acidentes de " + cadastraEstatistica[i].tipoVeiculo + " em 2015.");
            }
        }
        reader.close();

    }

    static void tipo() throws FileNotFoundException, IOException {
        int i;
        int tipoTipo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de veículo que deseja consultar : "));
        String fileName = "RegistroEstatistica2015.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i] = new Estatistica();
        }
        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i].nomeCidade = reader.readLine();
            cadastraEstatistica[i].codCidade = Integer.parseInt(reader.readLine());
            cadastraEstatistica[i].qtdAcidentes = Integer.parseInt(reader.readLine());
            cadastraEstatistica[i].tipoVeiculo = Integer.parseInt(reader.readLine());
        }
        for (i = 0; i < 15; i++) {
            if (tipoTipo == cadastraEstatistica[i].tipoVeiculo) {
                System.out.println("Registro" + " : " + cadastraEstatistica[i].nomeCidade + "(código " + cadastraEstatistica[i].codCidade + ") registrou " + cadastraEstatistica[i].qtdAcidentes + " acidentes de " + cadastraEstatistica[i].tipoVeiculo + " em 2015.");
            }
        }
        reader.close();
    }

    static void qtdAcid() throws FileNotFoundException, IOException {
        int i;
        String fileName = "RegistroEstatistica2015.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i] = new Estatistica();
        }
        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i].nomeCidade = reader.readLine();
            cadastraEstatistica[i].codCidade = Integer.parseInt(reader.readLine());
            cadastraEstatistica[i].qtdAcidentes = Integer.parseInt(reader.readLine());
            cadastraEstatistica[i].tipoVeiculo = Integer.parseInt(reader.readLine());
        }
        for (i = 0; i < 15; i++) {
            if (cadastraEstatistica[i].qtdAcidentes > 100 && cadastraEstatistica[i].qtdAcidentes < 500) {
                System.out.println("Registro" + " : " + cadastraEstatistica[i].nomeCidade + "(código " + cadastraEstatistica[i].codCidade + ") registrou " + cadastraEstatistica[i].qtdAcidentes + " acidentes de " + cadastraEstatistica[i].tipoVeiculo + " em 2015.");
            }
        }
        reader.close();
    }

    static void media() throws FileNotFoundException, IOException {
        int i;
        int aux = 0;
        String fileName = "RegistroEstatistica2015.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i] = new Estatistica();
        }
        for (i = 0; i < 15; i++) {
            cadastraEstatistica[i].nomeCidade = reader.readLine();
            cadastraEstatistica[i].codCidade = Integer.parseInt(reader.readLine());
            cadastraEstatistica[i].qtdAcidentes = Integer.parseInt(reader.readLine());
            cadastraEstatistica[i].tipoVeiculo = Integer.parseInt(reader.readLine());
        }
        for (i = 0; i < 15; i++) {
            for (int j = 0; j < 14; j++) {
                if (cadastraEstatistica[j].qtdAcidentes > cadastraEstatistica[j + 1].qtdAcidentes) {
                    aux = cadastraEstatistica[j].qtdAcidentes;
                    cadastraEstatistica[j].qtdAcidentes = cadastraEstatistica[j + 1].qtdAcidentes;
                    cadastraEstatistica[j + 1].qtdAcidentes = aux;
                }
            }
        }
        double aux1 = 0;
        System.out.println("O maior No. de acidentes foi : " + cadastraEstatistica[14].qtdAcidentes);
        System.out.println("O menor No. de acidentes foi : " + cadastraEstatistica[0].qtdAcidentes);
        for (i = 0; i < 15; i++) {
            aux1 = aux1 + cadastraEstatistica[i].qtdAcidentes;
        }
        aux1 = aux1 / 15;
        System.out.println("A média de acidentes foi : " + aux1);
        reader.close();
    }
}
