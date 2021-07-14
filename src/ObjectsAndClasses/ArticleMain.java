package ObjectsAndClasses;

import java.util.Scanner;

public class ArticleMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(", ");

        Article myArticle = new Article(articleData[0], articleData[1], articleData[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");

            switch (command[0]){
                case "Edit":

                    myArticle.Edit(command[1]);

                    break;
                case "ChangeAuthor":

                    myArticle.changeAuthor(command[1]);

                    break;
                case "Rename":

                    myArticle.rename(command[1]);

                    break;
            }
        }

        System.out.println(myArticle.toString());
    }
}
