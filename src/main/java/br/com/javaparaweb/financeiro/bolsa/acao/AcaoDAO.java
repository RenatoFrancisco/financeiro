package br.com.javaparaweb.financeiro.bolsa.acao;

import java.util.List;

import br.com.javaparaweb.financeiro.usuario.Usuario;

public interface AcaoDAO {
	void salvar(Acao acao);
	void excluir(Acao acao);
	List<Acao> listar(Usuario usuario);
}
