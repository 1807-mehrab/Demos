/*
1) Import JDBC packages
2) Load Oracle JDBC drivers
3) Connect to the database
4) Perform some DML
5) Transaction control
6) Looping through ResultSet
7) Get methods
*/

//Import JDBC packages
import java.sql.*;

public class BasicExample {
    public static void main(String[] args) {
        //Declare Connection and Statement objects
        Connection myConnection = null;
        Statement myStatement = null;
        //PreparedStatement myStatement = null;

        try {
            //Register the driver
            DriverManager.registerDriver(
                new oracle.jdbc.OracleDriver()
            );

            //Configure Connection object
            myConnection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", 
                "beardb", 
                "p4ssw0rd"
            );

            //disable auto-commit mode
            myConnection.setAutoCommit(false);

            //Create statement object from connection
            myStatement = myConnection.createStatement();

            //Perform a SQL INSERT with statement
            myStatement.execute(
                "INSERT INTO bear (bear_name, bear_age, bear_weight, bear_type_id, cave_id) VALUES ('Panda', 10, 300, 1, 2)"
            );

            //Commit
            myConnection.commit();

            //Create a ResultSet object for reading data
            ResultSet bearResultSet = myStatement.executeQuery(
                "SELECT * FROM bear"
            );

            //loop through rows in ResultSet
            while(bearResultSet.next()) {
                System.out.print(bearResultSet.getString("bear_name"));
                System.out.print(" is " + bearResultSet.getInt("bear_age") + " yrs old.");
                System.out.println();
            }

            bearResultSet.close();

        } catch (SQLException ex) {
            ex.getMessage();
        } finally {
            try {
                if (myStatement != null) {
                    myStatement.close();
                }

                if (myConnection != null) {
                    myConnection.close();
                }
            } catch (SQLException ex) {
                ex.getMessage();
            }
        }
    }
}