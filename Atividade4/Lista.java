package Atividade4;

public interface Lista {
    public void imprimir();
    public void insereInicio(Object elemento);
    public void insereFim(Object elemento);
    public boolean estahVazia();
    public boolean remover(Object elemento);
    public int tamanho();
}