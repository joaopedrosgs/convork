package t3;
import java.util.HashMap;
import java.util.LinkedList;


public class PilhaDeTabelas {
    HashMap<String, LinkedList<EntradaTabelaDeSimbolos>> structs; // mapeia o nome de cada registro com uma lista que armazena todos os seus respectivos campos
    HashMap<String, LinkedList<String>> functions; // mapeia o nome de cada função e procedimento com uma lista que armazena todos os seus respectivos parâmetros
    private LinkedList<TabelaDeSimbolos> pilha; // pilha normal

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
        structs = new HashMap<String, LinkedList<EntradaTabelaDeSimbolos>>();
        functions = new HashMap<String, LinkedList<String>>();

        empilhar(new TabelaDeSimbolos("global"));
        topo().adicionarSimbolo("literal", "tipo", "");
        topo().adicionarSimbolo("inteiro", "tipo", "");
        topo().adicionarSimbolo("real", "tipo", "");
        topo().adicionarSimbolo("logico", "tipo", "");
        topo().adicionarSimbolo("^literal", "tipo", "");
        topo().adicionarSimbolo("^inteiro", "tipo", "");
        topo().adicionarSimbolo("^real", "tipo", "");
        topo().adicionarSimbolo("^logico", "tipo", "");
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
    }

    public String tipoDeDadoDoSimbolo(String nome){
        for(TabelaDeSimbolos ts : pilha){
            EntradaTabelaDeSimbolos etds = ts.getSimbolo(nome);
            if(etds != null) {
                return etds.getTipoDeDado();
            }
        }
        return "";
    }
}