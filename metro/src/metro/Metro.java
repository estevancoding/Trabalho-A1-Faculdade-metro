
package metro;

import java.util.Scanner;
import java.util.Arrays;

public class Metro {

	public static void main(String[] args){

		System.out.println("O metro vai comecar a andar, informe os passageiros de cada carro: ");
        int opt = 0;
        int[] metro;
        metro = new int[ 6 ];
        Scanner scanner = new Scanner(System.in);
        while(opt != 2){
            if(opt != 0){
                for(int x = 0; x < 6; x++){
                    System.out.println("Vagao " + String.valueOf(x + 1) + " - " + String.valueOf(metro[x]) + " - " + getColor(metro[x]) );
                }
                    System.out.println("Passageiros totais do trem: " + getPassageiros(metro));
            }

            for(int x = 0; x < 6; x++){
                System.out.print("Passageiros que entraram no vagao " + String.valueOf(x + 1) + ": ");
                int addPassageiros =+ scanner.nextInt();
                while(addPassageiros < 0 || metro[x] + addPassageiros > 250){
                    System.out.print("Valor invalido, informe um valor valido: ");
                    addPassageiros = scanner.nextInt();
                }
                metro[x] = metro[x] + addPassageiros;
                System.out.print("Passageiros que sairam do vagao " + String.valueOf(x + 1) + ": ");
                int remPassageiros =+ scanner.nextInt();
                while(remPassageiros < 0 || metro[x] + remPassageiros < 0){
                    System.out.print("Valor invalido, informe um valor valido: ");
                    remPassageiros = scanner.nextInt();
                }
                metro[x] = metro[x] - remPassageiros;
            }
            System.out.print("Informe 1 para o metro continuar e 2 para parar: ");
            opt = scanner.nextInt();

        }        
	}

    public static int getPassageiros(int [] metro) {
        int total = 0;
        for(int x = 0; x < 6; x++){
            total = total + metro[x];
        }
        return total;
    }

    public static String getColor(int passageiros) {
        if(passageiros < 51) {
            return "azul";
        }
        if(passageiros < 101) {
            return "amarelo";
        }
        if(passageiros < 151) {
            return "laranja";
        }
        return "vermelho";
    }
}

   
