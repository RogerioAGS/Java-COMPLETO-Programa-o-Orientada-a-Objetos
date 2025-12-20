package application; // Define o pacote desta classe

import java.util.Locale; // Importa para garantir o ponto decimal (ex: 4.50 em vez de 4,50)
import java.util.Scanner; // Importa para ler dados do teclado
import util.CurrencyConverter; // Importa a classe de conversão que criamos no outro arquivo

public class Program {

    public static void main(String[] args) {
        
        // Define o padrão de numeração para o dos EUA (USA) para aceitar pontos decimais
        Locale.setDefault(Locale.US);
        
        // Instancia o objeto Scanner para leitura de dados
        Scanner sc = new Scanner(System.in);

        // Solicita e lê a cotação do dólar
        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        // Solicita e lê a quantidade de dólares que o usuário quer comprar
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        // Chama o método estático da classe CurrencyConverter.
        // Como o método é 'static', usamos o nome da Classe (CurrencyConverter) e não um objeto.
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);

        // Exibe o resultado formatado com duas casas decimais (%.2f)
        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        // Fecha o scanner para evitar vazamento de recursos de memória
        sc.close();
    }
}