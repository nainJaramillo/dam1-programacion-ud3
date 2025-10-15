public class IntroduccionArrays {

    /**
     * Muestra por consola la temperatura máxima de cada día de la semana.
     *
     * @param temperaturas Array de enteros con las temperaturas de cada día (7 elementos)
     */
    public void mostrarTemperaturas(int[] temperaturas) {
        
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.println(dias[i] + ": " + temperaturas[i] + "º");
        }
    }

    /**
     * Método principal del programa.
     */
    public static void main(String[] args) {
        // Creamos un array con las temperaturas máximas de la semana
        int[] maxTemperaturas = {22, 23, 24, 24, 23, 21, 20};

        IntroduccionArrays programa = new IntroduccionArrays();

        programa.mostrarTemperaturas(maxTemperaturas);
    }
}
