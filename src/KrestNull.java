import java.util.Scanner;

public class KrestNull {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char mass[][] = {
                {'+', '+', '+'},
                {'+', '+', '+'},
                {'+', '+', '+'}};
        int i;
        int j;
        char winner = ' ';

        System.out.println("Начинаем игру");

        for (i = 0; i < mass.length; i++) {
            for (j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + "   ");
            }
            System.out.println();
        }

        while (winner == ' ') {
            System.out.println("Ход игрока 1(X)");
            System.out.println("Введите две координаты точки (0-2): ");
            int a = scanner.nextInt(3);
            int b = scanner.nextInt(3);
            mass[a][b] = 'X';


            for (i = 0; i < mass.length; i++) {
                for (j = 0; j < mass.length; j++) {

                    System.out.print(mass[i][j] + "   ");
                }
                System.out.println();
            }

            System.out.println("Ход игрока 2 (0)");
            System.out.println("Введите две координаты точки (0-2)");
            a = scanner.nextInt(3);
            b = scanner.nextInt(3);
            mass[a][b] = '0';

            for (i = 0; i < mass.length; i++) {
                for (j = 0; j < mass.length; j++) {

                    System.out.print(mass[i][j] + "   ");
                }
                System.out.println();
            }

            if (winner == ' ') {
                for (i = 0; i < mass.length; i++) {
                    for (j = 0; j < mass.length; j++) {
                        if (mass[i][j] == mass[i][j + 1] && mass[i][j + 1] == mass[i][j + 2] && mass[i][j] != '+') {
                            winner = mass[i][j];
                            break;
                        }
                        if (mass[i][j] == mass[i + 1][j] && mass[i + 1][j] == mass[i + 2][j] && mass[i][j] != '+') {
                            winner = mass[i][j];
                            break;
                        }
                        if (j == i && mass[i][j] != '+') {
                            winner = mass[i][j];
                            break;
                        }
                        if (mass[i][j + 2] == mass[i + 1][j + 1] && mass[i + 1][j + 1] == mass[i + 2][j] && mass[i + 1][j + 1] != '+') {
                            winner = mass[i + 1][j + 1];
                            break;
                        }
                    }

                }
                return;
            }
            if (winner == 'X') {
                System.out.println("Выиграл игрок 1(Х)");
                break;
            }
            if (winner == '0') {
                System.out.println("Выиграл игрок 2(0)");
                break;
            }
            if (winner == ' ') {
                System.out.println("Ничья");
                break;
            }

        }
    }
}