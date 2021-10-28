package edu.fa.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.fa.dao.ProfileDAO;
import edu.fa.entities.Profile;
import edu.fa.utils.DBContext;
import edu.fa.utils.SQLCommand;

public class ProfileDAOImpl implements ProfileDAO {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public Profile getProfileById(int accountId) throws SQLException {
		String query = "SELECT * FROM Profile WHERE AccountId=?";
		try {
			con = new DBContext().getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, accountId);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Profile(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
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
	public boolean updateProfileByAccId(Profile profile) throws SQLException {
		String query = SQLCommand.UPDATE_PROFILE;
		try {
			con = new DBContext().getConnection(); // mo ket noi toi sql
			ps = con.prepareStatement(query);// nem cau lenh query sang sql
			ps.setString(1, profile.getFirstName());
			ps.setString(2, profile.getLastName());
			ps.setString(3, profile.getPhone());
			ps.setString(4, profile.getDescription());
			ps.setInt(5, profile.getAccountId());
			int row=ps.executeUpdate();
			if(row>0) return true;
			else return false;
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
		return false;
	}
	
	@Override
	public boolean addProfile(Profile profile) throws SQLException {
		String query = SQLCommand.ADD_PROFILE;
		try {
			con = new DBContext().getConnection();
			ps = con.prepareStatement(query);
			ps.setInt(1, profile.getAccountId());
			ps.setString(2, profile.getFirstName());
			ps.setString(3, profile.getLastName());
			ps.setString(4, profile.getPhone());
			ps.setString(5, profile.getDescription());
			int row = ps.executeUpdate();
			if(row>0) return true;
			else return false;
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
		return false;
	}
	
	public static void main(String[] args) throws SQLException {
		System.out.println(new ProfileDAOImpl().getProfileById(4));
	}

}
