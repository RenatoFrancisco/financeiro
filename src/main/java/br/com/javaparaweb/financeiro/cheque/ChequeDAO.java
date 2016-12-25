package br.com.javaparaweb.financeiro.cheque;

import java.util.List;

import br.com.javaparaweb.financeiro.conta.Conta;

public interface ChequeDAO {
	void salvar(Cheque cheque);

	void excluir(Cheque cheque);

	Cheque carregar(ChequeId chequeId);

	List<Cheque> listar(Conta conta);
}
