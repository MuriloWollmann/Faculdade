import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Time time = new Time("Time A", "Tite");
        time.adicionarAtleta(new Atleta("Heisenberg", 40, "Zagueiro"));
        time.adicionarAtleta(new Atleta("Pelé", 20, "Zagueiro"));
        time.adicionarAtleta(new Atleta("Faustão", 30, "Goleiro"));

        double idadeMedia = time.calcularIdadeMedia();
        System.out.println("Idade média dos atletas: " + idadeMedia);
    }
}