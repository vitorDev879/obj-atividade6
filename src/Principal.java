import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[10];


        pessoas[0] = new Pessoa(1, "A", 50000);
        pessoas[1] = new Pessoa(2, "B", 60000);
        pessoas[2] = new Pessoa(3, "C", 55000);
        pessoas[3] = new Pessoa(4, "D", 70000);
        pessoas[4] = new Pessoa(5, "E", 48000);
        pessoas[5] = new Pessoa(6, "F", 72000);
        pessoas[6] = new Pessoa(7, "G", 56000);
        pessoas[7] = new Pessoa(8, "H", 61000);
        pessoas[8] = new Pessoa(9, "I", 53000);
        pessoas[9] = new Pessoa(10, "J", 75000);


        System.out.println(Arrays.toString(pessoas));
    }
}
