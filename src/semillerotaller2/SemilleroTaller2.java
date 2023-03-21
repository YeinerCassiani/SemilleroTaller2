
package semillerotaller2;

public class SemilleroTaller2 {

    public static void main(String[] args) {
        
        // Ejemplo de uso del método raizCuadrada
        double valor = 16;
        try {
            double raiz = CalculosNumericos.raizCuadrada(valor);
            System.out.println("La raíz cuadrada de " + valor + " es " + raiz);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Ejemplo de uso del método pendienteRecta
        double x1 = 0, y1 = 0, x2 = 3, y2 = 4;
        try {
            double pendiente = CalculosNumericos.pendienteRecta(x1, y1, x2, y2);
            System.out.println("La pendiente de la recta que pasa por los puntos (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") es " + pendiente);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Ejemplo de uso del método puntoMedioRecta
        double[] puntoMedio = CalculosNumericos.puntoMedioRecta(x1, y1, x2, y2);
        System.out.println("El punto medio de la recta que pasa por los puntos (" + x1 + "," + y1 + ") y (" + x2 + "," + y2 + ") es (" + puntoMedio[0] + "," + puntoMedio[1] + ")");
        
        // Ejemplo de uso del método raicesEcuacionCuadratica
        double a = 1, b = -5, c = 6;
        try {
            double[] raices = CalculosNumericos.raicesEcuacionCuadratica(a, b, c);
            System.out.println("Las raíces de la ecuación cuadrática " + a + "x^2 + " + b + "x + " + c + " son " + raices[0] + " y " + raices[1]);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Ejemplo de uso del método convertirBase
        double numero = 123.456;
        int base = 16;
        try {
            String resultado = CalculosNumericos.convertirBase(numero, base);
            System.out.println("El número " + numero + " en base " + base + " es " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
    
}
