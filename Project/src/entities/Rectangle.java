package entities;

public class Rectangle {

    // 1. ATRIBUTOS (FIELDS)
    public double width;
    public double height;

    // CONSTRUTOR PADRÃO
    public Rectangle() {
    }

    // CONSTRUTOR COM ARGUMENTOS
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double Area() {
        return this.width * this.height;
    }

    public double Perimeter() {
        return 2 * (this.width + this.height);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }
}
