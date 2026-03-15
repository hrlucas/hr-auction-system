import java.math.BigDecimal;

public class ProdutosDTO {
    private Integer id;
    private String nome;
    private BigDecimal valor;
    private String status;

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
