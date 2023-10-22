package br.ufpr.delt.termo;

import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    private ArrayList<Termo> termos;
    private static Banco banco;

    private Banco() {
        termos = new ArrayList<Termo>();

        termos.add(new Termo("teste", "TESTE"));
        termos.add(new Termo("poeta", "POETA"));
        termos.add(new Termo("caros", "CAROS"));
    }

    public static Banco getInstance() {
        if (banco == null) {
            banco = new Banco();
        }
        return banco;
    }

    public int size(){
        return termos.size();
    }

    public Termo getTermo(int i){
        return termos.get(i);
    }

}
