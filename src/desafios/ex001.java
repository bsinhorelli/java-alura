package desafios;

public class ex001 {
    public static void main (String[] args) {
        double celsius = 38;
        double formulaFahrenheit = (celsius * 1.8) + 32;

        System.out.println(String.format("A conversão de %.2f Celsius para Fahrenheit é igual a %.2f°F", celsius, formulaFahrenheit));

        int fahrenheitInteiro = (int) formulaFahrenheit;
        System.out.println(String.format("Conversão para fahrenheit como valor inteiro é %d°F", fahrenheitInteiro));
    }
}
