import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Breakfast b = new Breakfast();

        Scanner scan = new Scanner(System.in);

        String in = "";
        while (!in.equals("exit")) {
            if (in.equals("add")) {
                in = scan.nextLine();
                switch (in) {
                    case "Milk": b.add(new Milk());break;
                    case "Cheese": b.add(new Cheese());break;
                    case "Apple": b.add(new Apple());break;
                }
            }
            if (in.equals("count")) {
                b.logCount(scan.nextLine());
            }
            if (in.equals("welcome to the cum zone")) System.out.println("only cum inside anime girls");
            in = scan.nextLine();
        }
    }
}
//CUM