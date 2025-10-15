import org.bson.types.ObjectId;

public class UmidadeAr {
    private ObjectId id;
    private String local;
    private int nivelRecomendado; // Mapeia para "nivel Recomendado" no MongoDB
    private int nivelAtual;
    private String nivelAlerta;

    public UmidadeAr() {}

    public UmidadeAr(ObjectId id, String local, int nivelRecomendado, int nivelAtual, String nivelAlerta) {
        this.id = id;
        this.local = local;
        this.nivelRecomendado = nivelRecomendado;
        this.nivelAtual = nivelAtual;
        this.nivelAlerta = nivelAlerta;
    }

    // --- Getters e Setters (Implemente todos) ---
    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public int getNivelRecomendado() { return nivelRecomendado; }
    public void setNivelRecomendado(int nivelRecomendado) { this.nivelRecomendado = nivelRecomendado; }
    public int getNivelAtual() { return nivelAtual; }
    public void setNivelAtual(int nivelAtual) { this.nivelAtual = nivelAtual; }
    public String getNivelAlerta() { return nivelAlerta; }
    public void setNivelAlerta(String nivelAlerta) { this.nivelAlerta = nivelAlerta; }

    @Override
    public String toString() { return "UmidadeAr{" + "local='" + local + '\'' + ", nivelAtual=" + nivelAtual + ", nivelAlerta='" + nivelAlerta + '\'' + '}'; }
}