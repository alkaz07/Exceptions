public class NegativeLengthException extends GeometryException{
    double len;

    public NegativeLengthException(double len) {
        super("длина отрезка не бывает отрицательной "+len);
        this.len = len;
    }
}
