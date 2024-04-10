public class TriangleEx {
    double a, b, c;

    public TriangleEx(double a, double b, double c) throws Exception{
        if(a<0 || b<0 || c< 0)
            throw new Exception("сторона треугольника не может быть отрицательным числом");

        if(! check(a, b, c)){
            throw new Exception("нарушено неравенство треугольника!!!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "TriangleEx{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static boolean check(double a, double b, double c){
        return (a< b+c && b< a+c && c< a+b);
    }
}
