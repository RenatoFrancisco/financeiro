package br.com.javaparaweb.financeiro.util;

import org.hibernate.Session;

import br.com.javaparaweb.financeiro.bolsa.acao.AcaoDAO;
import br.com.javaparaweb.financeiro.bolsa.acao.AcaoDAOHibernate;
import br.com.javaparaweb.financeiro.categoria.CategoriaDAO;
import br.com.javaparaweb.financeiro.categoria.CategoriaDAOHibernate;
import br.com.javaparaweb.financeiro.cheque.ChequeDAO;
import br.com.javaparaweb.financeiro.cheque.ChequeDAOHibernate;
import br.com.javaparaweb.financeiro.conta.ContaDAO;
import br.com.javaparaweb.financeiro.conta.ContaDAOHibernate;
import br.com.javaparaweb.financeiro.lancamento.LancamentoDAO;
import br.com.javaparaweb.financeiro.lancamento.LancamentoDAOHibernate;
import br.com.javaparaweb.financeiro.usuario.UsuarioDAO;
import br.com.javaparaweb.financeiro.usuario.UsuarioDAOHibernate;

public class DAOFactory {
	
	public static UsuarioDAO criarUsuarioDAO() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(session);
		return usuarioDAO;
	}
	
	public static ContaDAO criarContaDAO() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		ContaDAOHibernate contaDAO = new ContaDAOHibernate();
		contaDAO.setSession(session);
		return contaDAO;
	}
	
	public static CategoriaDAO criarCategoriaDAO() {
		Session  session = HibernateUtil.getSessionFactory().getCurrentSession();
		CategoriaDAOHibernate categoriaDAO = new CategoriaDAOHibernate();
		categoriaDAO.setSession(session);
		return categoriaDAO;
	}
	
	public static LancamentoDAO criaLancamentoDAO() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		LancamentoDAOHibernate lancamentoDAO = new LancamentoDAOHibernate();
		lancamentoDAO.setSession(session);
		return lancamentoDAO;
	}
	
	public static ChequeDAO criaChequeDAO() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		ChequeDAOHibernate chequeDAO = new ChequeDAOHibernate();
		chequeDAO.setSession(session);
		return chequeDAO;
	}
	
	public static AcaoDAO criarAcaoDAO() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		AcaoDAOHibernate acaoDAO = new AcaoDAOHibernate();
		acaoDAO.setSession(session);
		return acaoDAO;
	}
}
