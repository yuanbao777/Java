/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displaytesting;

import database.DBManager;
/**
 * Test class demonstrates the basic CRUD functionalities provided by
 * the DBManager class. The class inserts, displays, and deletes a
 * recipient from the database.
 */
public class Test {
    
    /**
     * The main method serves as an entry point for the Test class.
     * It establishes a connection with the database, displays recipients,
     * inserts a new recipient, and then deletes it.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        DBManager db = new DBManager();

// Display Recipients
db.displayRecipients();

// Insert a new recipient
db.insertRecipient("Jane Doe", 2023, "Toronto", "Arts");
System.out.println("After Inserting Jane Doe:");
db.displayRecipients();

// Delete the newly inserted recipient (You would typically get the AwardID from the UI or another method)
db.deleteRecipient(66);  // Replace 100 with the correct AwardID for Jane Doe
System.out.println("After Deleting Jane Doe:");
db.displayRecipients();
    }
}