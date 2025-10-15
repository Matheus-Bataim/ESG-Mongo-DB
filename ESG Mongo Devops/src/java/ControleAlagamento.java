import org.bson.types.ObjectId;

public class ControleAlagamento {
    private ObjectId id;
    private String endereco;
    private double nivelAgua;
    private String previsao;
    private String nivelAlerta;

    // Construtor Vazio (Obrigatório para o POJO Codec do MongoDB)
    public ControleAlagamento() {}

    // Construtor Completo (Obrigatório para o seu código de inserção)
    public ControleAlagamento(ObjectId id, String endereco, double nivelAgua, String previsao, String nivelAlerta) {
        this.id = id;
        this.endereco = endereco;
        this.nivelAgua = nivelAgua;
        this.previsao = previsao;
        this.nivelAlerta = nivelAlerta;
    }

    // --- Getters e Setters (Implemente todos) ---
    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public double getNivelAgua() { return nivelAgua; }
    public void setNivelAgua(double nivelAgua) { this.nivelAgua = nivelAgua; }
    public String getPrevisao() { return previsao; }
    public void setPrevisao(String previsao) { this.previsao = previsao; }
    public String getNivelAlerta() { return nivelAlerta; }
    public void setNivelAlerta(String nivelAlerta) { this.nivelAlerta = nivelAlerta; }

    @Override
    public String toString() { return "ControleAlagamento{" + "endereco='" + endereco + '\'' + ", nivelAgua=" + nivelAgua + ", nivelAlerta='" + nivelAlerta + '\'' + '}'; }
}


