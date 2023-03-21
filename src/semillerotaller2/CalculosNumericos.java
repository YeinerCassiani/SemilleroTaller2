
package semillerotaller2;

public class CalculosNumericos {
    
    public static double raizCuadrada(double valor) {
        if (valor < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(valor);
    }
    
    public static double pendienteRecta(double x1, double y1, double x2, double y2) {
        if (x1 == x2) {
            throw new ArithmeticException("La pendiente de una recta vertical no está definida.");
        }
        return (y2 - y1) / (x2 - x1);
    }
    
    public static double[] puntoMedioRecta(double x1, double y1, double x2, double y2) {
        double xMedio = (x1 + x2) / 2;
        double yMedio = (y1 + y2) / 2;
        return new double[] { xMedio, yMedio };
    }
    
    public static double[] raicesEcuacionCuadratica(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            throw new ArithmeticException("La ecuación cuadrática no tiene raíces reales.");
        }
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return new double[] { x1, x2 };
    }
    
    public static String convertirBase(double numero, int base) {
        if (base < 2 || base > 36) {
            throw new ArithmeticException("La base debe estar entre 2 y 36.");
        }
        String digitos = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder resultado = new StringBuilder();
        boolean esNegativo = false;
        if (numero < 0) {
            esNegativo = true;
            numero = -numero;
        }
        int entero = (int)numero;
        double fraccion = numero - entero;
        while (entero > 0) {
            int resto = entero % base;
            resultado.insert(0, digitos.charAt(resto));
            entero /= base;
        }
        if (resultado.length() == 0) {
            resultado.append("0");
        }
        if (esNegativo) {
            resultado.insert(0, "-");
        }
        if (fraccion > 0) {
            resultado.append(".");
            for (int i = 0; i < 10; i++) {
                fraccion *= base;
                int cifra = (int)fraccion;
                resultado.append(digitos.charAt(cifra));
                fraccion -= cifra;
                if (fraccion == 0) {
                    break;
                }
            }
        }
        return resultado.toString();
    }
}
