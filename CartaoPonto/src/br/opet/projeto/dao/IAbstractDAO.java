package br.opet.projeto.dao;

import java.sql.SQLException;
import java.util.List;

public interface IAbstractDAO<T> {
	List<T> listarTodos() throws SQLException;
	T procuraPorId(int id);
	boolean inserir(T entidade);
	boolean atualizar(T entidade);
	boolean deletar(int id);
	boolean fazerLogin(String user, String pass);
}
