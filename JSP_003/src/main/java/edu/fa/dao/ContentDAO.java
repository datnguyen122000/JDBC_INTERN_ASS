package edu.fa.dao;

import java.sql.SQLException;
import java.util.List;

import edu.fa.entities.Content;

public interface ContentDAO {

	boolean addContent(Content content) throws SQLException;

	List<Content> viewContent(int accountId) throws SQLException;

}