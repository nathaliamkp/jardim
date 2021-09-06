import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arvore {

    private String especie;
    private int ocupacao;

    public Arvore(String especie, int ocupacao) {
        this.especie = especie;
        this.ocupacao = ocupacao;
    }

    public String getEspecie() {
        return especie;
    }

    public int getOcupacao() {
        return ocupacao;
    }


}



