package HundirLaFlota;

/**
 * Juego: HUNDIR LA FLOTA
 * @author Manuel Carrera Pazó
 * @version 1.0
 */
public class HundirLaFlota {
    /**
     * Funcion prindipal
     * @param args parametros del juego
     */
    public static void main(String[] args) {
        int [][] tablero = new int [][]{{4,4,4,4,0},
                                        {0,0,0,0,0},
                                        {0,0,0,0,2},
                                        {0,0,0,0,2},
                                        {0,0,1,0,0}};

        recorrerTablero(tablero);
    }

    /**
     * Recorre el tablero de juego
     * @param tablero array 2D, el tablero con los barcos
     */
    private static void recorrerTablero(int[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(tablero[i][j] == 0){
                    System.out.println("AGUAAA!! Posicion: (Fila)" + (i + 1) + ", (Columna)" + (j +1));
                } else {
                    tipoNave(tablero, i, j);
                }
            }
        }
    }

    /**
     * Muestra por pantalla el tipo de nave segun el valor de las coordenadas
     * También muestra la coordenada(x) y la ordenada(y)
     * @param tablero array 2D, el tablero con los barcos
     * @param x coordenada, eje horizontal
     * @param y ordenada, eje vertical
     */
    private static void tipoNave(int[][] tablero, int x, int y){
                switch (tablero[x][y]) {
                    case 1 -> System.out.println("FRAGATA TOCADOOO!!! Posicion: (Fila)" + (x + 1) + ", (Columna)" + (y +1));
                    case 2 -> System.out.println("DESTRUCTOR TOCADOOO!!! Posicion: (Fila)" + (x + 1) + ", (Columna)" + (y +1));
                    case 3 -> System.out.println("ACORAZADO TOCADOOO!!! Posicion: (Fila)" + (x + 1) + ", (Columna)" + (y + 1));
                    case 4 -> System.out.println("SUBMARINO TOCADOOO!!! Posicion: (Fila)" + (x + 1) + ", (Columna)" + (y +1));
                    case 5 -> System.out.println("PORTA AVIÓNES TOCADOOO!!! Posicion: (Fila)" + (x + 1) + ", (Columna)" + (y +1));
                    default -> System.out.println("");
                }

    }
}

