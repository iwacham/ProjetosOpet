package br.opet.projeto.dao;

import java.sql.SQLException;
import java.util.List;

public interface IAbstractDAO<T> {
	List<T> listarTodos() throws SQLException;
	List<T> procuraPorId(long id);
	boolean inserir(T entidade);
	boolean atualizar(T entidade);
	boolean deletar(T entidade);
	boolean fazerLogin(String user, String pass);
}
