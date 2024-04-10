public class TriangleGeoEx {
    double a, b, c;

    public TriangleGeoEx(double a, double b, double c) throws GeometryException{
        if(a<0) throw new NegativeLengthException(a);
        if(b<0) throw new NegativeLengthException(b);
        if(c<0) throw new NegativeLengthException(c);

        if(! check(a, b, c)){
            throw new InvalidTriangleException("нарушено неравенство треугольника!!!", a, b, c);
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
