import org.bson.types.ObjectId;
import java.util.Date;

public class Temperatura {
    private ObjectId id;
    private String local;
    private int temperaturaAtual;
    private int sensacaoTermica; // Mapeia para "sensacao Termica" no MongoDB
    private Date dataHora; // Mapeia para ISODate no MongoDB

    public Temperatura() {}

    public Temperatura(ObjectId id, String local, int temperaturaAtual, int sensacaoTermica, Date dataHora) {
        this.id = id;
        this.local = local;
        this.temperaturaAtual = temperaturaAtual;
        this.sensacaoTermica = sensacaoTermica;
        this.dataHora = dataHora;
    }

    // --- Getters e Setters (Implemente todos) ---
    public ObjectId getId() { return id; }
    public void setId(ObjectId id) { this.id = id; }
    public String getLocal() { return local; }
    public void setLocal(String local) { this.local = local; }
    public int getTemperaturaAtual() { return temperaturaAtual; }
    public void setTemperaturaAtual(int temperaturaAtual) { this.temperaturaAtual = temperaturaAtual; }
    public int getSensacaoTermica() { return sensacaoTermica; }
    public void setSensacaoTermica(int sensacaoTermica) { this.sensacaoTermica = sensacaoTermica; }
    public Date getDataHora() { return dataHora; }
    public void setDataHora(Date dataHora) { this.dataHora = dataHora; }

    @Override
    public String toString() { return "Temperatura{" + "local='" + local + '\'' + ", temperaturaAtual=" + temperaturaAtual + ", dataHora=" + dataHora + '}'; }
}