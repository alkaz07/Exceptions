import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        example0();
//        example1();
//        example2();
       // example3();
       // example4();
       // example5();
        example6();
    }

    private static void example6() {
        try {
            Scanner scanner = new Scanner(new File("input triangles.txt"));
            ArrayList<TriangleGeoEx> triangles = new ArrayList<>();
            int i = 0;
            while (scanner.hasNext()) {
                i++;
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                try {
                    TriangleGeoEx tr = new TriangleGeoEx(a, b, c);
                    triangles.add(tr);
                } catch (InvalidTriangleException e) {
                    System.out.println("строка " + i + ": у нас тут треугольник не создается!");
                    System.out.println(e.getMessage());
                } catch (NegativeLengthException e){
                    System.out.println("строка " + i + ": у нас тут отрезок какой-то не такой");
                    System.out.println(e.getMessage());
                } catch (GeometryException e) {
                    System.out.println("что-то пошло не так");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void example5() {
        try {
            Scanner scanner = new Scanner(new File("input triangles.txt"));
            ArrayList<TriangleEx> triangles = new ArrayList<>();
            int i=0;
            while (scanner.hasNext()) {
                i++;
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                    try {
                        TriangleEx tr = new TriangleEx(a, b, c);
                        triangles.add(tr);
                    }
                    catch (Exception e){
                        System.out.println("строка "+i+": у нас тут треугольник не создается!");
                        System.out.println(e.getMessage());
                    }
            }
            scanner.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    private static void example4() {
        String s = "c.txt";
        try {
            Scanner scanner = new Scanner(new File(s));
            int x = scanner.nextInt();
            System.out.println("в файле число x="+x);
        }
        catch (FileNotFoundException e){
            System.out.println("не найден файл "+s);
        }
        catch (InputMismatchException e)
        {
            System.out.println("первое, что мы встретили в файле - не число!");
        }
        catch (Exception e){
            System.out.println("какая-то еще проблема, мы такую не предусмотрели выше");
            System.out.println(e.getMessage());
        }
        System.out.println("продолжение работы");
    }

    private static void example3() {
        String s = "a.txt";
        try {
            Scanner scanner = new Scanner(new File(s));
            int x = scanner.nextInt();
            System.out.println("в файле число x="+x);
        }
        catch (Exception e){
            System.out.println("какая-то проблема с файлом "+s);
            System.out.println(e.getMessage());
        }
        System.out.println("продолжение работы");
    }

    private static void example0() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        int x = scanner.nextInt();

        System.out.println("вы ввели x="+x);
        System.out.println("продолжение работы");
    }

    private static void example1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        if (scanner.hasNextInt()){
            int x = scanner.nextInt();
            System.out.println("вы ввели x="+x);
        }
        else
            System.out.println("ай-яй-яй");

        System.out.println("продолжение работы");

    }

    private static void example2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число");
        try {
            int x = scanner.nextInt();
            System.out.println("вы ввели x=" + x);
        }
        catch (Exception e){
            System.out.println("ой-ой-ой");
        }

        System.out.println("продолжение работы");
    }
}