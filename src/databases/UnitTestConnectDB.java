package databases;

import org.junit.Test;
import java.io.IOException;
import java.sql.SQLException;

public class UnitTestConnectDB {
    public static void main(String[] args) {
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

            try {
                ConnectToSqlDB.connectToSqlDatabase();
                System.out.println("MYSQL database is connected successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }




