/*Faça um aplicativo que receba o ano de nascimento de uma
pessoa e uma outra data qualquer e mostre quantos anos a pessoa
terá nessa segunda data escolhida. Caso seja informada uma data
anterior ao nascimento, deverá emitir a mensagem "Pessoa ainda
não nascida nessa data".*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.text.ParseException;


public class ex1 {
    public static void main(String[] args) throws ParseException {
        Scanner leitura = new Scanner(System.in);

        int ano;
        String dataString;

        System.out.println("Entre com o ano de nascimento: ");
        ano = leitura.nextInt();
        leitura.nextLine();
        System.out.println("Entre com uma data qualquer: (dd/MM/yyyy)");
        dataString = leitura.nextLine();

        LocalDate dataNascimento = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        int anoData = dataNascimento.getYear();

        int idade = ano - anoData;

        if (ano < anoData) {
            System.out.println("Vc terá " + idade + " anos.");
        } else {
            System.out.println("Ops... Pessoa ainda não nascida na data " + dataNascimento + ".");
        }

        leitura.close();
    }
}
