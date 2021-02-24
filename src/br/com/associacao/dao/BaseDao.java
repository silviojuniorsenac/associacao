/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.associacao.dao;

import java.sql.SQLException;

/**
 *
 * @author Silvio
 * @param <T>
 * @param <ID>
 */
public interface BaseDao<T, ID> {
    
    void salvar(T entidade) throws SQLException;
    
    void alterar(T entidade) throws SQLException;
}
