package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

    private List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalrioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
//        this.validacoes.forEach(v -> v.validar(funcionario, aumento));

        ValidaçãoPercentualReajuste validaçãoPercentualReajuste = new ValidaçãoPercentualReajuste();
        ValidaçãoPeriodicidadeEntreReajustes validaçãoPeriodicidadeEntreReajustes = new ValidaçãoPeriodicidadeEntreReajustes();


        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);
        funcionario.atualizarSalario(salarioReajustado);
    }
}