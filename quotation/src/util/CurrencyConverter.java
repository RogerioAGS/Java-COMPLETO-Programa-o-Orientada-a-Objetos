package util; // Define o pacote onde a classe está localizada

public class CurrencyConverter {

    // IOF é uma constante de taxa (6%). 
    // 'static' permite que ela seja acessada sem criar um objeto da classe.
    public static double IOF = 0.06;

    /**
     * Realiza a conversão de dólares para reais aplicando a taxa de IOF.
     * @param amount Quantidade de dólares desejada.
     * @param dollarPrice A cotação atual do dólar.
     * @return O valor final a ser pago em reais.
     */
    public static double dollarToReal(double amount, double dollarPrice) {
        // Multiplica a quantidade pelo preço e depois aplica o acréscimo de 6% (1.0 + 0.06)
        return amount * dollarPrice * (1.0 + IOF);
    }
}