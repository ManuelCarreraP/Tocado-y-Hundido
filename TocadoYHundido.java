public class TocadoYHundido {
    public static void main(String[] args) {
        int [][] tablero = new int [][]{{4,4,4,4,0},
                {0,0,0,0,0},
                {0,0,0,0,2},
                {0,0,0,0,2},
                {0,0,1,0,0}};

        recorrerTablero(tablero);
    }
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
