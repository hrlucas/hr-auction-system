import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutosDAO {

    public boolean cadastrarProduto(ProdutosDTO produto) throws SQLException {
        String sql = "INSERT INTO produtos (nome, valor, status) VALUES (?, ?, ?)";

        try (Connection conn = new conectaDAO().connectDB();
             PreparedStatement prep = conn.prepareStatement(sql)) {
            prep.setString(1, produto.getNome());
            prep.setBigDecimal(2, produto.getValor());
            prep.setString(3, produto.getStatus());
            return prep.executeUpdate() > 0;
        }
    }

    public ArrayList<ProdutosDTO> listarProdutos() throws SQLException {
        ArrayList<ProdutosDTO> listagem = new ArrayList<>();
        String sql = "SELECT id, nome, valor, status FROM produtos ORDER BY id";

        try (Connection conn = new conectaDAO().connectDB();
             PreparedStatement prep = conn.prepareStatement(sql);
             ResultSet resultset = prep.executeQuery()) {
            while (resultset.next()) {
                ProdutosDTO produto = new ProdutosDTO();
                produto.setId(resultset.getInt("id"));
                produto.setNome(resultset.getString("nome"));
                produto.setValor(resultset.getBigDecimal("valor"));
                produto.setStatus(resultset.getString("status"));
                listagem.add(produto);
            }
        }

        return listagem;
    }

    public boolean venderProduto(int id) throws SQLException {
        String sql = "UPDATE produtos SET status = 'Vendido' WHERE id = ? AND status <> 'Vendido'";

        try (Connection conn = new conectaDAO().connectDB();
             PreparedStatement prep = conn.prepareStatement(sql)) {
            prep.setInt(1, id);
            return prep.executeUpdate() > 0;
        }
    }
}
