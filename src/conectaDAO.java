import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectaDAO {

    private static final String HOST = System.getenv().getOrDefault("DB_HOST", "localhost");
    private static final String PORT = System.getenv().getOrDefault("DB_PORT", "3306");
    private static final String DATABASE = System.getenv().getOrDefault("DB_NAME", "hr_auction_system");
    private static final String USER = System.getenv().getOrDefault("DB_USER", "root");
    private static final String PASSWORD = System.getenv().getOrDefault("DB_PASSWORD", "");
    private static final String URL =
            "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE
                    + "?useSSL=false"
                    + "&requireSSL=false"
                    + "&verifyServerCertificate=false"
                    + "&allowPublicKeyRetrieval=true"
                    + "&serverTimezone=America/Sao_Paulo";

    public Connection connectDB() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
