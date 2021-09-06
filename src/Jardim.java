
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class Jardim {

    private List<Arvore> arvores;
    private final Espaco espacoTotal;
    private Espaco espacoDisponivel;



    public Jardim(int quantidadeArvoresIniciais, int dimensao) {
        this.espacoTotal = new Espaco(dimensao);
        this.arvores = criarListaDeArvores(quantidadeArvoresIniciais);

    }

    public List<Arvore> criarListaDeArvores (int quantidadeArvoresIniciais) {
        List<Arvore> arvores = new ArrayList<>();
        int dimensaoOcupada = espacoTotal.getDimensaom2();
        if (quantidadeArvoresIniciais > 0) {
            for (int i = 0; i < quantidadeArvoresIniciais; i++) {
                System.out.println("Responda para a árvore " + (i+1));
                Arvore arvore = escolherArvoreParaOJardim(dimensaoOcupada);
                arvores.add(arvore);
                dimensaoOcupada = dimensaoOcupada - arvore.getOcupacao();
            }
            this.espacoDisponivel = new Espaco(dimensaoOcupada);
        }else{
            this.espacoDisponivel = new Espaco(dimensaoOcupada);
        }
        return arvores;
    }


    private Arvore escolherArvoreParaOJardim(int diponibilidadeDeEspaco){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto a árvore ocupa de espaço?");
        int ocupacao = sc.nextInt();
        while (ocupacao > diponibilidadeDeEspaco){
            System.out.println("Acho que você se enganou, não é possível ter essa árvore no seu seu jardim. Espaço insuficiente. Informe novamente quanto a árvore ocupa de espaço");
            ocupacao = sc.nextInt();
        }
        System.out.println("Qual é a espécie da árvore?");
        String especie = sc.next();
        return new Arvore(especie, ocupacao);
    }

    public void plantarArvoreNoJardim(){
        if (espacoDisponivel.getDimensaom2() > 2){
            Arvore arvore = escolherArvoreParaOJardim(espacoDisponivel.getDimensaom2());
            espacoDisponivel.setDimensaom2(espacoDisponivel.diminuirEspaco(arvore.getOcupacao()));
            arvores.add(arvore);
        }else {
            System.out.println("Desculpe, o seu espaço é insuficiente para plantio");
        }

    }

    public void jardimStatus(){
        System.out.println("O tamanho total do seu jardim é " + espacoTotal.getDimensaom2() + "m2.");
        System.out.println("O seu jardim possui " + contarAvoresNoJardim() + " árvores.");
        listarEspecies();
        System.out.println("O seu jardim possui " + contarEspacoDisponivel() + "m2 diponíveis para plantio.");
    }

    private int contarAvoresNoJardim(){
        return arvores.size();
    }

    private int contarEspacoDisponivel(){
        return espacoDisponivel.getDimensaom2();
    }


    private void listarEspecies(){
        if(arvores.size() > 0){
            HashSet<String> especies = new HashSet<>();
            arvores.forEach(arvore -> especies.add(arvore.getEspecie()));
            String especiesPlantadas = especies.toString();
            System.out.println("O seu jardim possui as seguintes espécies: " + especiesPlantadas + ".");
        } else{
            System.out.println("Não há arvores no seu jardim");
        }

    }


}