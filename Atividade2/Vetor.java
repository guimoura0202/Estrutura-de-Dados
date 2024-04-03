package Atividade2;

public class Vetor {
    private Aluno vetAlunos [] = new Aluno[4];
    private int cont = 0;
    public void adicionaAluno(String nome, int idade, double nota){
        Aluno aluno = new Aluno(nome, idade, nota);
        vetAlunos[cont]=aluno;
        cont++;
    }
    public int numeroDeAlunos(){
        return cont + 1;
    }
    public boolean contem(String nome, int idade, double nota){
        for (int i=0;i<this.cont;i++){
            if(this.vetAlunos[i].getNome()==nome&&this.vetAlunos[i].getIdade()==idade&&vetAlunos[i].getNota()==nota){
                return true;
            }
        }
        return false;
    }
}
