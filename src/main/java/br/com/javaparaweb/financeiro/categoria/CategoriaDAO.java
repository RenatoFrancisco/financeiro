package br.com.javaparaweb.financeiro.categoria;

import java.util.List;

import br.com.javaparaweb.financeiro.usuario.Usuario;

public interface CategoriaDAO {
	Categoria salvar(Categoria categoria);

	void excluir(Categoria categoria);

	Categoria carregar(Integer categoria);

	List<Categoria> listar(Usuario usuario);
}
