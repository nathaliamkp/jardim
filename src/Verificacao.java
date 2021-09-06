import java.util.Locale;
import java.util.Scanner;

public class Verificacao {


    public Verificacao() {
    }

    public int verificarDados(int dado){
        System.out.println("Valor invalido. Digite outro valor");
        Scanner scanner = new Scanner(System.in);
        dado = scanner.nextInt();
        return dado;

    }

    public String verificarConfirmacao(String respostaInicial){
        String resposta = tratamentoDeString(respostaInicial);
        resposta = compararString(resposta);
        return resposta;
    }

    private String tratamentoDeString(String respostaInicial){
        String resposta = respostaInicial.toLowerCase(Locale.ROOT);
        return resposta;
    }

    private String compararString(String resposta){
        Scanner sc = new Scanner(System.in);
        String respostaNegativa = "não";
        String respostaPositiva = "sim";
        while (! resposta.equals(respostaNegativa) && !resposta.equals(respostaPositiva)  ) {
            System.out.println("Desculpe, não entendi a sua resposta, por favor, responda outra vez:");
            resposta = sc.next();
            tratamentoDeString(resposta);
        }
        return resposta;
    }
}
