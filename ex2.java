/*  A fábrica de refrigerantes da coca-cola vende
    seu produto em três formatos: lata de 350 ml,
    garrafa de 600 ml e garrafa de 2 litros. Faça
    um programa para que o comerciante informe o quanto
    está comprando de cada formato e depois calcule quantos
    litros de refrigerante ele comprou.*/

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        int totalLata, total600, total2l, totalLitros, qntLata, qnt600, qnt2l;

        System.out.println("Quantidade de latas:");
        qntLata = leitura.nextInt();

        System.out.println("Quantidade de garrafas 600");
        qnt600 = leitura.nextInt();

        System.out.println("Quantidade de garrafas 2L:");
        qnt2l = leitura.nextInt();

        totalLata = qntLata * 350;
        total600 = qnt600 * 600;
        total2l = qnt2l * 2000;

        totalLitros = (total600 + total2l + totalLata) / 1000;
        System.out.println("Foi comprado " + totalLitros + " litros");

        leitura.close();
    }
}
