package exercicios;

public class Funcionario {
    public String nome;
    public String email;
    public Integer idade;
    public Double salario;

    public Funcionario(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String obterDados() {
        return String.format("%s, %d anos (%s) %n", nome, idade, email);
    }

    public void promover(Double porcentagemAumento) {
        salario += (salario * porcentagemAumento);
    }
}
