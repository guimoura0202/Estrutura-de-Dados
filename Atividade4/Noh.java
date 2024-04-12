package Atividade4;

public class Noh {
    private Object elemento;
    private Noh proximo;
    public Noh(Object elemento){
        this.elemento = elemento;
        this.proximo = null;
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
    public String toString(){
        return elemento.toString();
    }
}
