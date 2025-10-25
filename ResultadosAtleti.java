import java.util.Scanner;

public class ResultadosAtleti {

    // Clase que representa un partido del Atlético
    static class Partido {
        private final String rival;
        private final int golesMarcados;  // a favor
        private final int golesRecibidos; // en contra

        // Constructor: sirve para crear un nuevo partido
        public Partido(String rival, int golesMarcados, int golesRecibidos) {
            this.rival = rival;
            this.golesMarcados = golesMarcados;
            this.golesRecibidos = golesRecibidos;
        }

        // Métodos para obtener la información (getters)
        public String getRival() { return rival; }
        public int getGolesMarcados() { return golesMarcados; }
        public int getGolesRecibidos() { return golesRecibidos; }

        @Override
        public String toString() {
            return String.format("vs %s (%d-%d)", rival, golesMarcados, golesRecibidos);
        }
    }

    // ---------------------------------------------------------------------
    // MÉTODOS A IMPLEMENTAR
    // ---------------------------------------------------------------------

    // Calcula la media de goles marcados
    public static double mediaGolesMarcados(Partido[] temporada) {
        double suma = 0;

        for (Partido p : temporada) {
            suma += p.getGolesMarcados();
        }

        return suma / temporada.length;
    }

    // Devuelve el partido con MÁS goles marcados
    public static Partido partidoMasGolesMarcados(Partido[] temporada) {
        Partido mejor = temporada[0];

        for (int i = 1; i < temporada.length; i++) {
            if (temporada[i].getGolesMarcados() > mejor.getGolesMarcados()) {
                mejor = temporada[i];
            }
        }

        return mejor;
    }

    // Devuelve el partido con MENOS goles marcados
    public static Partido partidoMenosGolesMarcados(Partido[] temporada) {
        Partido peor = temporada[0];

        for (int i = 1; i < temporada.length; i++) {
            if (temporada[i].getGolesMarcados() < peor.getGolesMarcados()) {
                peor = temporada[i];
            }
        }

        return peor;
    }

    // Total de goles marcados
    public static int totalGolesMarcados(Partido[] temporada) {
        int total = 0;
        for (Partido p : temporada) {
            total += p.getGolesMarcados();
        }
        return total;
    }

    // Total de goles recibidos
    public static int totalGolesRecibidos(Partido[] temporada) {
        int total = 0;
        for (Partido p : temporada) {
            total += p.getGolesRecibidos();
        }
        return total;
    }

    // ---------------------------------------------------------------------
    // MAIN (aquí empieza el programa)
    // ---------------------------------------------------------------------
    public static void main(String[] args) {

        // Lista de partidos jugados
        Partido[] temporada = {
            new Partido("Sevilla", 3, 1),
            new Partido("Real Sociedad", 2, 1),
            new Partido("Valencia", 0, 0),
            new Partido("Barcelona", 2, 3),
            new Partido("Real Madrid", 0, 5),
            new Partido("Rayo Vallecano", 4, 2)
        };

        // Calculamos los resultados usando los métodos
        double media = mediaGolesMarcados(temporada);
        Partido mas = partidoMasGolesMarcados(temporada);
        Partido menos = partidoMenosGolesMarcados(temporada);
        int marcados = totalGolesMarcados(temporada);
        int recibidos = totalGolesRecibidos(temporada);

        // Mostramos los resultados por pantalla
        System.out.printf("Media de goles marcados: %.2f%n", media);
        System.out.printf("Partido con MÁS goles marcados: %s%n", mas);
        System.out.printf("Partido con MENOS goles marcados: %s%n", menos);
        System.out.printf("TOTAL goles marcados: %d | TOTAL goles recibidos: %d%n", marcados, recibidos);
    }
}
