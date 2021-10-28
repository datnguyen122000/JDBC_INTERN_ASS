package edu.fa.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.fa.dao.AccountDAO;
import edu.fa.entities.Account;
import edu.fa.entities.Content;
import edu.fa.entities.Profile;
import edu.fa.utils.DBContext;
import edu.fa.utils.SQLCommand;

public class AccountDAOImpl implements AccountDAO {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public Account getAccount(String email, String password) throws SQLException {
		String query = SQLCommand.GET_ACCOUNT;
		try {
			con = new DBContext().getConnection();
			ps = con.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
		} catch (Exception e) {
		}finally {
			if (rs != null) {
				rs.close();
			}

			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		}

		return null;
	}

	@Override
	public void addAccount(Account account) throws SQLException {
		String query = SQLCommand.ADD_ACCOUNT;
		try {
			con = new DBContext().getConnection(); // mo ket noi toi sql
			ps = con.prepareStatement(query);// nem cau lenh query sang sql
			ps.setString(1, account.getUserName());
			ps.setString(2, account.getEmail());
			ps.setString(3, account.getPassword());

			ps.executeUpdate();
		} catch (Exception e) {
		}finally {
			if (rs != null) {
				rs.close();
			}

			if (ps != null) {
				ps.close();
			}
			if (con != null) {
				con.close();
			}
		}
	}

	
	
	public static void main(String[] args) throws SQLException {
		
	}

}
