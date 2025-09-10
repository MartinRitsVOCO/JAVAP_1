package part1.week2.ül39;

public class Main {
    public static void main(String[] args) {
        printStars(3);
        printStars(7);
        printStars(4);

        System.out.println();

        printSquare(6);

        System.out.println();

        printRectangle(5, 8);

        System.out.println();

        printTriangle(9);
    }

    private static void printStars(int amount) {
        while (amount > 0) {
            amount--;
            System.out.print("*");
        }
        System.out.println();
    }

    private static void printSquare(int amount) {
        printRectangle(amount, amount);

/*  Alternatiivselt:
        int width = amount;

        while (amount > 0) {
            amount--;
            printStars(width);
        }
        System.out.println();
*/
    }

    private static void printRectangle(int width, int height) {
        while (height > 0) {
            height--;
            printStars(width);
        }

        System.out.println();
    }

    private static void printTriangle(int height) {
        int width = 1;

        while (height > 0) {
            height--;
            printStars(width);
            width++;
        }
    }
}

