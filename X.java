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

