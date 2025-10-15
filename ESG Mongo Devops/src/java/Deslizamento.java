import org.bson.types.ObjectId;

public class Deslizamento {
    private ObjectId id;
    private String local;
    private int umidadeSolo; // Mapeia para "umidade Solo"
    private int umidadeRecomendada;
    private String consistenciaSolo; // Mapeia para "consistencia Solo"
    private String consistenciaRecomendada;
    private String nivelAlerta;

    public Deslizamento() {}

    public Deslizamento(ObjectId id, String local, int umidadeSolo, int umidadeRecomendada, String consistenciaSolo, String consistenciaRecomendada, String nivelAlerta) {
        this.id = id;
        this.local = local;
        this.umidadeSolo = umidadeSolo;
        this.umidadeRecomendada = umidadeRecomendada;
        this.consistenciaSolo = consistenciaSolo;
        this.consistenciaRecomendada = consistenciaRecomendada;
        this.nivelAlerta = nivelAlerta;
    }

    // --- Getters e Setters (Implemente todos) ---
    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public int getUmidadeSolo() { return umidadeSolo; }
    public void setUmidadeSolo(int umidadeSolo) { this.umidadeSolo = umidadeSolo; }
    public int getUmidadeRecomendada() { return umidadeRecomendada; }
    public void setUmidadeRecomendada(int umidadeRecomendada) { this.umidadeRecomendada = umidadeRecomendada; }
    public String getConsistenciaSolo() { return consistenciaSolo; }
    public void setConsistenciaSolo(String consistenciaSolo) { this.consistenciaSolo = consistenciaSolo; }
    public String getConsistenciaRecomendada() { return consistenciaRecomendada; }
    public void setConsistenciaRecomendada(String consistenciaRecomendada) { this.consistenciaRecomendada = consistenciaRecomendada; }
    public String getNivelAlerta() { return nivelAlerta; }
    public void setNivelAlerta(String nivelAlerta) { this.nivelAlerta = nivelAlerta; }

    @Override
    public String toString() { return "Deslizamento{" + "local='" + local + '\'' + ", umidadeSolo=" + umidadeSolo + ", nivelAlerta='" + nivelAlerta + '\'' + '}'; }
}