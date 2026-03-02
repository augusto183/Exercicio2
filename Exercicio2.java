package Exercicio2;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class X 
{
    private int id;
    private String nome;
    private double valor;

    public X(int id, String nome, double valor) 
    {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public double getValor() 
    {
        return valor;
    }

    public void setValor(double valor) 
    {
        this.valor = valor;
    }

    public String toString() 
    {
        return "ID: " + id + ", Nome: " + nome + ", Valor: " + valor;
    }
}
public class XDAO 
{
	private List<X> lista = new ArrayList<>();

    public void inserir(X x) 
    {
        lista.add(x);
    }

    public List<X> listar() 
    {
        return lista;
    }

    public boolean atualizar(int id, String novoNome, double novoValor) 
    {
        for (X x : lista) {
            if (x.getId() == id) {
                x.setNome(novoNome);
                x.setValor(novoValor);
                return true;
            }
        }
        return false;
    }

    public boolean excluir(int id) {
        for (X x : lista) 
        {
            if (x.getId() == id) 
            {
                lista.remove(x);
                return true;
            }
        }
        return false;
    }
}
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