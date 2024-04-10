public class InvalidTriangleException extends GeometryException{
    double a, b, c;
    public InvalidTriangleException() {
    }

    public InvalidTriangleException(String message) {
        super(message);
    }

    public InvalidTriangleException(String message, double a, double b, double c) {
        super(message);
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
