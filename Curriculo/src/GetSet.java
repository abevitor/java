public class GetSet {
    private String nome;
    private int idade;
    private String email;
    private String cursando;
    private String escolaridade;
    private String graduacao;
    private double salario;

    public void setNome(String nome){

        this.nome = nome;

    }

    public void setIdade(int idade) {

        this.idade = idade;

    }

    public void setEmail(String email){

        this.email = email;
    }

    public void setCursando(String cursando){
        
        this.cursando = cursando;
    }

    public void setEscolaridade(String escolaridade) {

        this.escolaridade = escolaridade;

    }

    public void setGraduacao(String graduacao) {

        this.graduacao = graduacao;

    }

    public void setSalario(double salario){

        this.salario = salario;

    }
    public String getNome() {

        return nome;

    }

    public int getIdade(){

        return idade;

    }

    public String getEmail(){

        return email;

    }

    public String getCursando(){

        return cursando;

    }

    public String getEscolaridade(){

        return escolaridade;

    }

    public String getGraduacao() {

        return graduacao;

    }

    public double getSalario(){

        return salario;
        
    }

}
