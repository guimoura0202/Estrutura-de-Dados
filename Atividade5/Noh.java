package Atividade5;

public class Noh {
    private Object elemento;
    private Noh proximo;
    private Noh anterior;
    public Noh(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
        this.anterior = null;
    }
    public Object getElemento() {
        return elemento;
    }
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }
    public Noh getProximo() {
        return proximo;
    }
    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
    public Noh getAnterior() {
        return anterior;
    }
    public void setAnterior(Noh anterior) {
        this.anterior = anterior;
    }
    public String toString(){
        return elemento.toString();
    }
}
