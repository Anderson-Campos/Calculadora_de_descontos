import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos itens foram comprado?");
        int itensComprados = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual foi o valor total pago? ");
        String precosString = scanner.nextLine();

        precosString = precosString.replace(",", ".");

        double precos = Double.parseDouble(precosString);

        if (itensComprados >= 26){
            System.out.println("Voce tem 80% de desconto");
            double novoPreco = precos * 0.80;
            System.out.println("preço atualizado é: " + novoPreco);

        } else if (itensComprados >= 21  && itensComprados <= 25){
            System.out.println("Voce tem 75% de desconto");
            double novoPreco = precos * (1- 0.75);
            System.out.println("preço atualizado é: " + novoPreco);

        } else if (itensComprados >= 16  && itensComprados <= 20) {
            System.out.println("Voce tem 50% de desconto");
            double novoPreco = precos * (1- 0.50);
            System.out.println("preço atualizado é: " + novoPreco);

        } else if (itensComprados >= 6  && itensComprados <= 15) {
            System.out.println("Voce tem 25% de desconto");
            double novoPreco = precos * (1- 0.25);
            System.out.println("preço atualizado é: " + novoPreco);

        } else if (itensComprados >= 1 && itensComprados <= 5 ) {
            System.out.println("Voce tem 20% de desconto");
            double novoPreco = precos * (1- 0.20);
            System.out.println("preço atualizado é: " + novoPreco);

        }else {
            System.out.println("Volte sempre!");
        }
    }
}