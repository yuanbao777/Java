/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import java.util.Properties;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * DBManager class provides functionalities to interact with the database 
 * using JDBC. It allows operations like displaying recipients, inserting 
 * a new recipient, and deleting a recipient based on the award ID.
 */
public class DBManager {

    private Connection conn;
    /**
     * Constructs a new DBManager instance by establishing a database 
     * connection using properties from a file.
     */
      public DBManager() {
        try {
            Properties props = new Properties();
            InputStream input = Files.newInputStream(Paths.get("src/database.properties"));
            props.load(input);

            String url = props.getProperty("jdbc.url");
            String username = props.getProperty("jdbc.username");
            String password = props.getProperty("jdbc.password");

            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
/**
     * Displays all the recipients from the Recipients table in the 
     * database along with their attributes.
     */
    public void displayRecipients() {
    
    try (Statement statement = conn.createStatement();
         ResultSet resultSet = statement.executeQuery("SELECT * FROM Recipients")) {

        ResultSetMetaData metaData = resultSet.getMetaData();
        int numberOfColumns = metaData.getColumnCount();
        System.out.println("Recipients Table of Ontario Database:\n");

        for (int i = 1; i <= numberOfColumns; i++) {
            System.out.printf("%-20s\t", metaData.getColumnName(i));
        }
        System.out.println();

        while (resultSet.next()) {
            for (int i = 1; i <= numberOfColumns; i++) {
                System.out.printf("%-20s\t", resultSet.getObject(i));
            }
            System.out.println();
        }

        System.out.println("\nRecipients Table - Column Attributes:");
        for (int i = 1; i <= numberOfColumns; i++) {
            System.out.printf("%-20s\t", metaData.getColumnName(i));
            System.out.printf("%-20s\t", metaData.getColumnTypeName(i));
            System.out.printf("%-20s\t", metaData.getColumnClassName(i));
            System.out.println();
        }

        System.out.println();
    } catch (SQLException sqlException) {
        sqlException.printStackTrace();
    }
}
/**
     * Inserts a new recipient into the Recipients table in the database.
     * 
     * @param name     The name of the recipient.
     * @param year     The year when the award was given.
     * @param city     The city of the recipient.
     * @param category The category of the award.
     */
public void insertRecipient(String name, int year, String city, String category) {
    try {
        PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Recipients (Name, Year, City, Category) VALUES (?, ?, ?, ?)");
        pstmt.setString(1, name);
        pstmt.setInt(2, year);
        pstmt.setString(3, city);
        pstmt.setString(4, category);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
/**
     * Deletes a recipient from the Recipients table in the database 
     * based on a specified award ID.
     * 
     * @param awardID The unique identifier for the award/recipient.
     */
public void deleteRecipient(int awardID) {
    try {
        PreparedStatement pstmt = conn.prepareStatement("DELETE FROM Recipients WHERE AwardID = ?");
        pstmt.setInt(1, awardID);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}