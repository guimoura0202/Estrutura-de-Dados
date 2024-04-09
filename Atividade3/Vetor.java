package Atividade3;

public class Vetor {
    private Aluno vetAlunos [] = new Aluno[4];
    private int cont = 0;
    public void adicionaAluno(String nome, int idade, double nota){
        this.garanteEspaco();
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
    private boolean cheio(){
        return this.cont == this.vetAlunos.length;
    }
    private void garanteEspaco(){
        if (this.cheio()){
            Aluno[] novoVet = new Aluno[this.vetAlunos.length * 2];
            for (int i=0; i < this.vetAlunos.length; i++)
            novoVet[i] = this.vetAlunos[i];
            this.vetAlunos = novoVet;
        }
    }
    public boolean remove(Aluno aluno){
        for (int i=0;i<this.cont;i++){
            if(this.vetAlunos[i].getNome()==aluno.getNome()&&this.vetAlunos[i].getIdade()==aluno.getIdade()&&vetAlunos[i].getNota()==aluno.getNota()){
                for (int j=i;j<this.cont;j++){
                    this.vetAlunos[j]=this.vetAlunos[j+1];
                }
                this.cont--;
                return true;
            }
        }
        return false;
    }
    public String toString(){
        String str = "";
        for (int i=0;i<this.cont;i++){
            str += this.vetAlunos[i].getNome() + " " + this.vetAlunos[i].getIdade() + " " + this.vetAlunos[i].getNota() + "\n";
        }
        return str;
    }
}
