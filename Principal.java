package Exercicio2;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);
        XDAO dao = new XDAO();
        int opcao;

        do 
        {
            System.out.println("\nMENU");
            System.out.println("1 - Listar");
            System.out.println("2 - Inserir");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) 
            {

                case 1:
                    System.out.println("\nLista ");
                    for (X x : dao.listar()) 
                    {
                        System.out.println(x);
                    }
                    break;

                case 2:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();

                    dao.inserir(new X(id, nome, valor));
                    System.out.println("Inserido com sucesso!");
                    break;

                case 3:
                    System.out.print("ID para atualizar: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo nome: ");
                    String novoNome = scanner.nextLine();

                    System.out.print("Novo valor: ");
                    double novoValor = scanner.nextDouble();

                    if (dao.atualizar(idAtualizar, novoNome, novoValor)) 
                    {
                        System.out.println("Atualizado com sucesso!");
                    } 
                    else 
                    {
                        System.out.println("ID não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID para excluir: ");
                    int idExcluir = scanner.nextInt();

                    if (dao.excluir(idExcluir)) 
                    {
                        System.out.println("Excluído com sucesso!");
                    } 
                    else 
                    {
                        System.out.println("ID não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        scanner.close();
    }
}