package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("@#+(?<productName>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+");
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            Matcher matcher = pattern.matcher(scanner.nextLine());

            if (matcher.find()){
                String productName = matcher.group("productName");
                StringBuilder productNumber = new StringBuilder();


                for (int j = 0; j < productName.length() ; j++) {
                    char currSymbol = productName.charAt(j);

                     if (Character.isDigit(currSymbol)){
                         productNumber.append(currSymbol);
                     }
                }

                if (productNumber.toString().isEmpty()){
                    System.out.println("Product group: 00");
                }else{
                    System.out.printf("Product group: %s \n", productNumber);
                }

            }
            else{
                System.out.println("Invalid barcode");
            }

        }
    }
}
