import java.util.Scanner;

public class ConversaoWrapper {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor númerico: ");
        int valorPrimitivo = scanner.nextInt();

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("Valor no tipo wrapper: " + valorWrapper);

        scanner.close();
    }
}