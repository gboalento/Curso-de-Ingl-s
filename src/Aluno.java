public class Aluno extends User{

    private int nivel_aluno;

    public void setNivel_aluno(int nivel){
        this.nivel_aluno = nivel;
    }

    public int getNivel_aluno(){
        return nivel_aluno;
    }

    public Aluno(String nome, String senha, int nivel){
        super(nome, senha);
        this.nivel_aluno = nivel;
    }
}
