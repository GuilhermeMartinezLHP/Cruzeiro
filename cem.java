public class cem {
    public static void main(String[] args) {
        int cont = 0;
        int acumulador = 0;
            
        while (cont<= 100) {
            System.out.println("Numero: " + cont); 
            cont++;//cont = cont + 1;
            acumulador = acumulador + cont;
        }
        System.out.println("acumulador total:" + acumulador);
    }

}
