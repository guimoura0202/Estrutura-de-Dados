package Atividade5;

public class LDE implements Lista{
    private Noh primeiro;
    private Noh ultimo;
    public LDE(){
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
            primeiro.setAnterior(novo);
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
            novo.setAnterior(ultimo);
            ultimo = novo;
        }
    }
    public boolean estahVazia(){
        return primeiro == null;
    }
    public boolean remover(Object elemento){
        Noh aux = primeiro;
        while(aux != null){
            if(aux.getElemento().equals(elemento)){
                if(aux == primeiro){
                    primeiro = aux.getProximo();
                    if(primeiro != null){
                        primeiro.setAnterior(null);
                    }
                    return true;
                }else if(aux == ultimo){
                    ultimo = aux.getAnterior();
                    if(ultimo != null){
                        ultimo.setProximo(null);
                    }
                    return true;
                }else{
                    aux.getAnterior().setProximo(aux.getProximo());
                    aux.getProximo().setAnterior(aux.getAnterior());
                    return true;
                }
            }
            aux = aux.getProximo();
        }
        return false;
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
