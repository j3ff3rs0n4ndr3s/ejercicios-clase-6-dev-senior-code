public class App {
    public static void main(String[] args) throws Exception {
        
                // Uso de una lambda con una interfaz funcional personalizada
                Operacion suma = (a, b) -> a + b;
                Operacion resta = (a, b) -> a - b;
        
                System.out.println("Suma: " + suma.operar(10, 5));
                System.out.println("Resta: " + resta.operar(10, 5));
            }
        }
        
        @FunctionalInterface
        interface Operacion {
            int operar(int a, int b);
        }
        



    

