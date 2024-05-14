public class User {
    String senha;
    String nome_user;

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public User(String nome, String senha){
        this.nome_user = nome;
        this.senha = senha;
    }
}
