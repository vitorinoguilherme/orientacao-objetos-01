package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {

    @Test
    public void criarObjetoFuncionario() {
        Funcionario f1 = new Funcionario("João da Silva", 22, "joao@email.com", 3000.0);
        assertNotNull(f1);
    }

    @Test
    public void presencaAtributos() {
        Funcionario f1 = new Funcionario("João da Silva", 22, "joao@email.com", 3000.0);
        assertNotNull(f1.nome);
        assertNotNull(f1.idade);
        assertNotNull(f1.email);
        assertNotNull(f1.salario);
    }

    @Test
    public void metodoObterDados() {
        Funcionario f1 = new Funcionario("João da Silva", 22, "joao@email.com", 3000.0);
        assertEquals("João da Silva, 22 anos (joao@email.com) ", f1.obterDados());
    }

    @Test
    public void metodoPromover() {
        Funcionario f1 = new Funcionario("João da Silva", 22, "joao@email.com", 3000.0);

        f1.promover(0.10);
        Double valorObtido = f1.getSalario();
        Double valorEsperado = ((0.10 * 3000.0) + 3000.0);

        assertEquals(valorEsperado, valorObtido);
    }
}
