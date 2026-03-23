
import java.sql.Connection;
import java.sql.DriverManager;

public class conectaDAO {

    public Connection connectDB() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://127.0.0.1:3306/leiloes";
            String user = "root";
            String password = "280420Md@";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro na conexão!");
            e.printStackTrace();
        }

        return conn;
    }
}