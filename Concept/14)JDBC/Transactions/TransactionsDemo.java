import java.sql.*;

public class JDBCTransactionExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "root";

        Connection con = null;

        try {
            // Establish connection
            con = DriverManager.getConnection(url, username, password);

            // Disable auto commit
            con.setAutoCommit(false);

            // Deduct 1000 from Alice
            String debitSQL =
                "UPDATE account SET balance = balance - 1000 WHERE id = 1";

            // Add 1000 to Bob
            String creditSQL =
                "UPDATE account SET balance = balance + 1000 WHERE id = 2";

            Statement stmt = con.createStatement();

            stmt.executeUpdate(debitSQL);
            stmt.executeUpdate(creditSQL);

            // If both operations are successful
            con.commit();

            System.out.println("Transaction successful!");
            System.out.println("Money transferred successfully.");

        } catch (SQLException e) {

            try {
                if (con != null) {
                    // Undo all changes if an error occurs
                    con.rollback();
                    System.out.println("Transaction failed.");
                    System.out.println("Changes rolled back.");
                }
            } catch (SQLException rollbackError) {
                rollbackError.printStackTrace();
            }

            e.printStackTrace();

        } finally {

            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
