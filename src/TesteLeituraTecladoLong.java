import java.util.Scanner;

public class TesteLeituraTecladoLong {

    public static void main(String[] args) {
        long dadoLongDigitado;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dado do tipo long e aperte a tecla enter:");
        dadoLongDigitado = scanner.nextLong();

        System.out.printf("O dado do tipo long digitado foi: %d", dadoLongDigitado);
    }
}
