package exercicios;

public class Funcionario {
    public String nome;
    public String email;
    public Integer idade;
    public Double salario;

    public String obterDados() {
        return String.format("%s, %d anos (%s) %n", nome, idade, email);
    }

    public void promover(Double porcentagemAumento) {
        salario += (salario * porcentagemAumento);
    }
}
