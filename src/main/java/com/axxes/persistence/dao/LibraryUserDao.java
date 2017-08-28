package com.axxes.persistence.dao;

import com.axxes.persistence.domain.LibraryUser;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Component
public class LibraryUserDao {

    @Autowired
    private ConnectionManager connectionManager;

    @Autowired
    private EntityManager entityManager;

    public List<LibraryUser> getUsersWithSuggestion() {
        return null;
    }

    public void removeLastSuggestion(long userId) {

    }

    @Transactional
    public void createUser(LibraryUser libraryUser) {
        entityManager.persist(libraryUser);
    }

    public LibraryUser findUserWithFirstName(String firstName) {
        try {
            Connection connection = connectionManager.openConnection();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM libraryuser WHERE (firstname = '" + firstName + "')";
            ResultSet resultSet = statement.executeQuery(sql);
            if(resultSet.next()) {
                LibraryUser libraryUser = buildLibraryUser(resultSet);
                connectionManager.closeConnection();
                return libraryUser;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        connectionManager.closeConnection();
        return null;
    }

    public List<LibraryUser> getAllUsers()  {
        try {
            Connection connection = connectionManager.openConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM libraryuser");

            List<LibraryUser> libraryUserList = Lists.newArrayList();
            while (resultSet.next()) {
                LibraryUser libraryUser = buildLibraryUser(resultSet);
                libraryUserList.add(libraryUser);
            }
            return libraryUserList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        connectionManager.closeConnection();
        return Lists.newArrayListWithCapacity(0);
    }

    public LibraryUser updateUserLastName(long id, String lastName) {
        try {
            Connection connection = connectionManager.openConnection();
            Statement statement = connection.createStatement();
            String sql = "UPDATE libraryuser set lastname = '" + lastName + "' WHERE (id = '" + id + "')";
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        connectionManager.closeConnection();
//        return getUser();
        return null;
    }

    public void removeUser(long id) {
    }

    private LibraryUser buildLibraryUser(ResultSet resultSet) throws SQLException {
        return new LibraryUser.Builder()
                .setId(resultSet.getLong("id"))
                .setEmail(resultSet.getString("email"))
                .setUserName(resultSet.getString("userName"))
                .setFirstName(resultSet.getString("firstName"))
                .setLastName(resultSet.getString("lastName"))
                .build();
    }
}