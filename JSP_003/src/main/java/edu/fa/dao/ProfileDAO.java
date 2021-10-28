package edu.fa.dao;

import java.sql.SQLException;

import edu.fa.entities.Profile;

public interface ProfileDAO {

	Profile getProfileById(int accountId) throws SQLException;

	boolean updateProfileByAccId(Profile profile) throws SQLException;

	boolean addProfile(Profile profile) throws SQLException;
}