package Atividade1;

public class PontoCartesiano {
    private float x, y;
    //Construtor da classe
    public PontoCartesiano(float x, float y) {
        this.x = x;
        this.y = y;
    }
    //Metodos Getters
    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    //Metodos Setters
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    //Metodo que retorna a distancia do ponto cartesiano atual e de outro ponto cartesiano
    public float retornaDistancia(PontoCartesiano outroPonto) {
        float xSubtracao = outroPonto.getX() - this.x;
        float xPotencia = (float) Math.pow(xSubtracao, 2);
        float ySubtracao = outroPonto.getY() - this.y;
        float yPotencia = (float) Math.pow(ySubtracao, 2);
        return (float) Math.sqrt(xPotencia + yPotencia);
    }
}
