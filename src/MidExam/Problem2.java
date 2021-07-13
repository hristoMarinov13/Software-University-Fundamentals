package MidExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> biscuitsList = new ArrayList<String>();

        for (String s : scanner.nextLine().split(", ")){
            biscuitsList.add(s);
        }

        String input = scanner.nextLine();
        String biscuit = "";

        while (!input.equals("No More Money")){

            String command = input.split("\\s+")[0].trim();
            biscuit = input.split("\\s+")[1].trim();


            switch (command){
                case "OutOfStock":

                    for (int i = 0; i < biscuitsList.size(); i++) {

                        if (biscuitsList.get(i).equals(biscuit)){
                            biscuitsList.set(i, "None");
                        }
                    }

                    break;

                case "Required":

                    int index = Integer.parseInt(input.split("\\s+")[2].trim());

                    if (index < biscuitsList.size()
                            && index >=0
                            &&!biscuitsList.get(index).equals("None")){

                        biscuitsList.set(index, biscuit);
                    }

                    break;

                case "Last":

                    biscuitsList.add(biscuit);

                    break;
            }

            input = scanner.nextLine();
        }



        for (int i = 0; i < biscuitsList.size(); i++) {
            if (!biscuitsList.get(i).equals("None")){
                System.out.printf("%s ", biscuitsList.get(i));
            }
        }

//        for (int i = 0; i < biscuitsList.size(); i++) {
//
//            if (biscuitsList.get(i).equals("None")){
//                biscuitsList.remove("None");
//            }
//        }


//        System.out.println(String.join(" ", biscuitsList));

    }
}
