
package t3;

import java.util.ArrayList;
import java.util.List;


public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;

    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<>();
        this.escopo = escopo;
    }

    public void adicionarSimbolo(String nome, String tipo, String tipoDeDado) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome, tipo, tipoDeDado));
    }

    public void adicionarSimbolo(EntradaTabelaDeSimbolos simbolo) {
        simbolos.add(simbolo);
    }

    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds : simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

    public String getEscopo(){
        return escopo;
    }

    public EntradaTabelaDeSimbolos getSimbolo(String nome){
        for(EntradaTabelaDeSimbolos etds : simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds;
            }
        }
        return null;
    }

    public List<EntradaTabelaDeSimbolos> getListaSimbolos(){
        return simbolos;
    }
}