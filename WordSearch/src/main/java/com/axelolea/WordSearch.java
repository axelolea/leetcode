package com.axelolea;

public class WordSearch {

    public static boolean exist(char[][] board, String word) {
        // Iteramos todas las casillas del board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // Validamos desde la pos 0
                if(dfs(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int pos) {
        
        // Si pos es igual a longitud de palabra, la palabra se encontro
        if(pos == word.length())
            return true;
        
        // Fuera del rango de la tabla
        if(i < 0 || i >= board.length || j < 0 || j >= board[i].length)
            return false;

        // Si la casilla actual, no corresponde a la pos en word, no es valido
        if(board[i][j] != word.charAt(pos))
            return false;
        
        char tmp = board[i][j];
        board[i][j] = '#'; // Usamos cualquier caracter que no sea una letra
        
        // Probar todas las direcciones
        if(
                dfs(board, word, i + 1, j, pos + 1) ||
                dfs(board, word, i - 1, j, pos + 1) ||
                dfs(board, word, i, j + 1, pos + 1) ||
                dfs(board, word, i, j - 1, pos + 1)
        ) return true;
        
        board[i][j] = tmp;
        
        return false;
    }

}