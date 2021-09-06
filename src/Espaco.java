import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Espaco {

    private int dimensaom2;

    public Espaco(int dimensaom2) {
        this.dimensaom2 = dimensaom2;
    }

    public int getDimensaom2() {
        return dimensaom2;
    }

    public void setDimensaom2(int dimensaom2) {
        this.dimensaom2 = dimensaom2;
    }

    public int diminuirEspaco( int ocupacaoArvore){
        int espacoDisponivel =  dimensaom2 - ocupacaoArvore;
        return espacoDisponivel;
    }


}
