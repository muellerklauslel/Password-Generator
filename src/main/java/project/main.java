package project;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class main {

    public static ArrayList<String> pool = new ArrayList<String>();
    public static int poolINT = 0;

    public static void main(String[] args) {

        int randomNum = ThreadLocalRandom.current().nextInt(4, 50 + 1);
        menu();
    }


    public static void menu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add all numbers separately!");
        System.out.println("[1] numbers 1 - 4");
        System.out.println("[2] numbers 1 - 6");
        System.out.println("[3] letters a - z");
        System.out.println("[4] letters A - Z");
        System.out.println("[5] special character (,.:-_#+~<>!$%&(){}=?@)");
        System.out.println("[6] all characters selected");

        String x = scanner.nextLine();

        switch (x) {
            case "1":
                pool.add("1");
                pool.add("2");
                pool.add("3");
                pool.add("4");
                poolINT = poolINT + 4;
                menu();
                break;
            case "2":
                pool.add("5");
                pool.add("6");
                poolINT = poolINT + 2;
                menu();
                break;
            case "3":
                pool.add("a");
                pool.add("b");
                pool.add("c");
                pool.add("d");
                pool.add("e");
                pool.add("f");
                pool.add("g");
                pool.add("h");
                pool.add("i");
                pool.add("j");
                pool.add("k");
                pool.add("l");
                pool.add("m");
                pool.add("n");
                pool.add("o");
                pool.add("p");
                pool.add("q");
                pool.add("r");
                pool.add("s");
                pool.add("t");
                pool.add("u");
                pool.add("v");
                pool.add("w");
                pool.add("x");
                pool.add("y");
                pool.add("z");
                poolINT = poolINT + 26;
                menu();
                break;
            case "4":
                pool.add("A");
                pool.add("B");
                pool.add("C");
                pool.add("D");
                pool.add("E");
                pool.add("F");
                pool.add("G");
                pool.add("H");
                pool.add("I");
                pool.add("J");
                pool.add("K");
                pool.add("L");
                pool.add("M");
                pool.add("N");
                pool.add("O");
                pool.add("P");
                pool.add("Q");
                pool.add("R");
                pool.add("S");
                pool.add("T");
                pool.add("U");
                pool.add("V");
                pool.add("W");
                pool.add("X");
                pool.add("Y");
                pool.add("Z");
                poolINT = poolINT + 26;
                menu();
                break;
            case "5":
                pool.add(",");
                pool.add(".");
                pool.add(":");
                pool.add("-");
                pool.add("_");
                pool.add("#");
                pool.add("+");
                pool.add("*");
                pool.add("<");
                pool.add(">");
                pool.add("!");
                pool.add("$");
                pool.add("%");
                pool.add("&");
                pool.add("(");
                pool.add(")");
                pool.add("{");
                pool.add("}");
                pool.add("=");
                pool.add("?");
                pool.add("@");
                poolINT = poolINT + 21;
                menu();
                break;
            case "6":
                menuNOC(pool, poolINT);
                break;
            default:
                System.out.println("Please enter a valid number");
                break;
        }
    }

    public static void menuNOC(ArrayList<String> pool, int poolINT) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of you're password (min. 4, max. 50)");
        int pwLength = Integer.parseInt(scanner.nextLine());

        generatePw(pool, pwLength, poolINT);
    }

    public static void generatePw(ArrayList<String> pool, int length, int poolINT) {
        String password = new String();

        for (int i = 0; i < length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, poolINT + 1);
            password = password + pool.get(randomNum);
        }

        System.out.println("Password: " + password);
    }
}
