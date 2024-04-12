package Atividade4;

public class LSE implements Lista{
    private Noh primeiro;
    private Noh ultimo;
    public LSE(){
        this.primeiro = null;
        this.ultimo = null;
    }
    public void imprimir(){
        Noh aux = primeiro;
        while(aux != null){
            System.out.println(aux.getElemento().toString());
            aux = aux.getProximo();
        }
    }
    public void insereInicio(Object elemento){
        Noh novo = new Noh(elemento);
        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else{
            novo.setProximo(primeiro);
            primeiro = novo;
        }
    }
    public void insereFim(Object elemento){
        Noh novo = new Noh(elemento);
        if(primeiro == null){
            primeiro = novo;
            ultimo = novo;
        }else{
            ultimo.setProximo(novo);
            ultimo = novo;
        }
    }
    public boolean estahVazia(){
        return primeiro == null;
    }
    public boolean remover(Object elemento){
        Noh aux = primeiro;
        Noh ant = null;
        while(aux != null && !aux.getElemento().equals(elemento)){
            ant = aux;
            aux = aux.getProximo();
        }
        if(aux == null){
            return false;
        }
        if(aux == primeiro){
            primeiro = primeiro.getProximo();
        }else{
            ant.setProximo(aux.getProximo());
        }
        if(aux == ultimo){
            ultimo = ant;
        }
        return true;
    }
    public int tamanho(){
        int tamanho = 0;
        Noh aux = primeiro;
        while(aux != null){
            tamanho++;
            aux = aux.getProximo();
        }
        return tamanho;
    }
}
