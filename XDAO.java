package Exercicio2;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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