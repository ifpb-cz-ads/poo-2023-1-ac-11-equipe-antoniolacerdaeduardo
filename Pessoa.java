public class Pessoa {
    private String nome, endereco;

    public Pessoa(String nome){
        this.setNome(nome);
    }
    
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
