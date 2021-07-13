package MidExamPreparation;

import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {//12:55
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;
        double totalTaxes =0;
        String input = scanner.nextLine();

        while (!input.equals("special") && !input.equals("regular")){

            double priceInput = Double.parseDouble(input);

            if (priceInput < 0){
                System.out.println("Invalid price!" );
                input = scanner.nextLine();
                continue;
            }
            
            totalPrice += priceInput;
            totalTaxes += priceInput * 20/100;
            input = scanner.nextLine();
        }




        if (totalPrice == 0){
            System.out.println("Invalid order!" );
        }else{

            double total = totalPrice + totalTaxes;
            if (input.equals("special")){
                total -= total * 10/100;
            }

            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPrice);
            System.out.printf("Taxes: %.2f$%n", totalTaxes);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", total);
        }
    }
}
