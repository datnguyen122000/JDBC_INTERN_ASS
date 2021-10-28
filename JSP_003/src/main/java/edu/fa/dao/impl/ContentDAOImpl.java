package edu.fa.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import edu.fa.dao.ContentDAO;
import edu.fa.entities.Content;
import edu.fa.utils.DBContext;
import edu.fa.utils.SQLCommand;

public class ContentDAOImpl implements ContentDAO {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	@Override
	public boolean addContent(Content content) throws SQLException {
		String query = SQLCommand.ADD_CONTENT;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		try {
			con = new DBContext().getConnection(); // mo ket noi toi sql
			ps = con.prepareStatement(query);// nem cau lenh query sang sql
			ps.setString(1, content.getTitle());
			ps.setString(2, content.getBrief());
			ps.setString(3, content.getContent());
			ps.setString(4, sdf.format(content.getCreatedDate()));
			ps.setInt(5, content.getAccountId());
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
	public List<Content> viewContent(int accountId) throws SQLException {
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String query = SQLCommand.VIEW_CONTENTS;
		List<Content> contents = new ArrayList<>();
		try {
			con = new DBContext().getConnection(); // mo ket noi toi sql
			ps = con.prepareStatement(query);// nem cau lenh query sang sql
			ps.setInt(1, accountId);
			rs = ps.executeQuery();
			while (rs.next()) {
				String time=sdf2.format(sdf1.parse(rs.getString(5)));
				String timeList[]=time.split(" ");
				contents.add(new Content(rs.getInt(1), 
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getDate(5),
						rs.getInt(6),
						timeList[0]+"<br>"+timeList[1]));
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
		return contents;
	}

}
