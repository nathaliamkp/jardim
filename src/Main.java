import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Verificacao verificacao = new Verificacao();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja criar um jardim? Informe qual é o tamanho dele em m2");
        int dimensao = scanner.nextInt();
        while (dimensao < 30) dimensao = verificacao.verificarDados(dimensao);

        System.out.println("Quantas árvores seu jardim já possui?");
        int quantidadeArvoresIniciais = scanner.nextInt();
        while (quantidadeArvoresIniciais < 0) quantidadeArvoresIniciais = verificacao.verificarDados(quantidadeArvoresIniciais);

        Jardim jardim = new Jardim(quantidadeArvoresIniciais, dimensao);
        jardim.jardimStatus();

        System.out.println("Se desejar plantar uma árvore no seu jardim? sim ou não?");
        String confirmacao = scanner.next();
        confirmacao = verificacao.verificarConfirmacao(confirmacao);

        while (confirmacao.equals("sim")){
            jardim.plantarArvoreNoJardim();
            jardim.jardimStatus();
            System.out.println("Se desejar plantar mais uma árvore no seu jardim? sim ou não?");
            confirmacao = scanner.next();
            confirmacao = verificacao.verificarConfirmacao(confirmacao);
        }

        scanner.close();
    }
}
