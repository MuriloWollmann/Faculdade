import java.util.ArrayList;
import java.util.List;

public class Time {
    String nomeTime;
    String tecnico;
    List<Atleta> atletas;

    Time(String nomeTime, String tecnico) {
        this.nomeTime = nomeTime;
        this.tecnico = tecnico;
        this.atletas = new ArrayList<>();
    }

    void adicionarAtleta(Atleta atleta) {
        this.atletas.add(atleta);
    }

    double calcularIdadeMedia() {
        if (atletas.isEmpty()) return 0;
        int soma = 0;
        for (Atleta atleta : atletas) {
            soma += atleta.idade;
        }
        return (double) soma / atletas.size();
    }
}
