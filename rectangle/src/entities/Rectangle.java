package entities;
/**
 * Classe que representa um Retângulo, baseada no diagrama UML.
 */
public class Rectangle {

    // 1. ATRIBUTOS (FIELDS) - Privados (-)
    // Eles definem o estado do objeto e só podem ser alterados ou acessados 
    // por métodos dentro desta própria classe (Encapsulamento).
    private double width;
    private double height;

    // 2. CONSTRUTOR - Método especial para criar e inicializar um objeto Rectangle.
    public Rectangle(double width, double height) {
        // 'this.width' refere-se ao atributo da classe; 'width' refere-se ao parâmetro.
        this.width = width;
        this.height = height;
        // Boas práticas recomendam adicionar validação aqui (ex: garantir que width e height > 0).
    }

    // 3. MÉTODOS PÚBLICOS (OPERATIONS) - Públicos (+)
    // Eles são a interface da classe, permitindo que outros códigos interajam com o objeto.

    /**
     * Calcula e retorna a área do retângulo.
     * Fórmula: Largura * Altura.
     * @return A área do retângulo como um double.
     */
    public double Area() {
        return this.width * this.height;
    }

    /**
     * Calcula e retorna o perímetro do retângulo.
     * Fórmula: 2 * (Largura + Altura).
     * @return O perímetro do retângulo como um double.
     */
    public double Perimeter() {
        return 2 * (this.width + this.height);
    }

    /**
     * Calcula e retorna a diagonal do retângulo.
     * Fórmula: Raiz Quadrada (Largura^2 + Altura^2) [Teorema de Pitágoras].
     * @return A diagonal do retângulo como um double.
     */
    public double Diagonal() {
        // Math.sqrt é para raiz quadrada (square root)
        // Math.pow(base, exponente) é para potenciação
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
    }
    
    // Opcionalmente, pode-se adicionar métodos Getters/Setters se o estado interno 
    // (Width e Height) precisar ser lido/modificado externamente de forma controlada.
}
}