package edu.fa.dao;

import java.sql.SQLException;

import edu.fa.entities.Account;

public interface AccountDAO {

	Account getAccount(String email, String password) throws SQLException;

	void addAccount(Account account) throws SQLException;

}