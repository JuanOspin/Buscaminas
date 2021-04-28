package sample;

import java.util.ArrayList;
import java.util.List;

public class ComproMinas {

    matriz M;
    int m, n;

    public ComproMinas(int m, int n) {
        M = new matriz(m,n);
        this.m = m;
        this.n = n;
        int i , j;
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                M.asignaDato(i,j,null);
            }
        }
    }

    void RellenoMinas(int x){
        int i, j,cont = 0;

        while(cont < x){
            i = (int) (Math.floor(Math.random() * m));
            j = (int) (Math.floor(Math.random() * n));

            if(M.retornaDatoObj(i,j) == null){
                M.asignaDato(i,j,0);
                cont = cont + 1;
            }
        }
    }

    public void compNumeros(){

        int i, j, cont = 1, k, l;
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                if(M.retornaDatoObj(i,j) != null){
                    if(M.retornaDato(i,j) == 0) {
                        if (i == 0 && j == 0) {
                            if (M.retornaDatoObj(i, j + 1) == null) {
                                M.asignaDato(i, j + 1, cont);
                            } else {
                                if (M.retornaDato(i, j + 1) != 0) {
                                    M.asignaDato(i, j + 1, M.retornaDato(i, j + 1) + 1);
                                }
                            }
                            for (k = i + 1; k <= i + 1; k++) {
                                for (l = j; l <= j + 1; l++) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }

                            }
                        }

                        if (i == 0 && j == n - 1) {

                            if (M.retornaDatoObj(i, j - 1) == null) {
                                M.asignaDato(i, j - 1, cont);
                            } else {
                                if (M.retornaDato(i, j - 1) != 0) {
                                    M.asignaDato(i, j - 1, M.retornaDato(i, j - 1) + 1);
                                }
                            }
                            for (k = i + 1; k <= i + 1; k++) {
                                for (l = j; l >= j - 1; l--) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }
                            }

                        }

                        if (i == m - 1 && j == 0) {
                            if (M.retornaDatoObj(i - 1, j) == null) {
                                M.asignaDato(i - 1, j, cont);
                            } else {
                                if (M.retornaDato(i - 1, j) != 0) {
                                    M.asignaDato(i - 1, j, M.retornaDato(i - 1, j) + 1);
                                }
                            }
                            for (k = i; k >= i - 1; k--) {
                                for (l = j + 1; l <= j + 1; l++) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }
                            }
                        }

                        if (i == m - 1 && j == n - 1) {
                            if (M.retornaDatoObj(i, j - 1) == null) {
                                M.asignaDato(i, j - 1, cont);
                            } else {
                                if (M.retornaDato(i, j - 1) != 0) {
                                    M.asignaDato(i, j - 1, M.retornaDato(i, j - 1) + 1);
                                }
                            }
                            for (k = i - 1; k >= i - 1; k--) {
                                for (l = j; l >= j - 1; l--) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }
                            }
                        }

                        if (i == 0 && j != 0 && j != n - 1) {
                            if (M.retornaDatoObj(i, j - 1) == null) {
                                M.asignaDato(i, j - 1, cont);
                            } else {
                                if (M.retornaDato(i, j - 1) != 0) {
                                    M.asignaDato(i, j - 1, M.retornaDato(i, j - 1) + 1);
                                }
                            }

                            if (M.retornaDatoObj(i, j + 1) == null) {
                                M.asignaDato(i, j + 1, cont);
                            } else {
                                if (M.retornaDato(i, j + 1) != 0) {
                                    M.asignaDato(i, j + 1, M.retornaDato(i, j + 1) + 1);
                                }
                            }

                            for (k = i + 1; k <= i + 1; k++) {
                                for (l = j - 1; l <= j + 1; l++) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }
                            }
                        }

                        if (i == m - 1 && j != 0 && j != n - 1) {
                            if (M.retornaDatoObj(i, j - 1) == null) {
                                M.asignaDato(i, j - 1, cont);
                            } else {
                                if (M.retornaDato(i, j - 1) != 0) {
                                    M.asignaDato(i, j - 1, M.retornaDato(i, j - 1) + 1);
                                }
                            }

                            if (M.retornaDatoObj(i, j + 1) == null) {
                                M.asignaDato(i, j + 1, cont);
                            } else {
                                if (M.retornaDato(i, j + 1) != 0) {
                                    M.asignaDato(i, j + 1, M.retornaDato(i, j + 1) + 1);
                                }
                            }

                            for (k = i - 1; k >= i - 1; k--) {
                                for (l = j - 1; l <= j + 1; l++) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }
                            }
                        }

                        if (i != 0 && i != m - 1 && j == 0) {
                            if (M.retornaDatoObj(i - 1, j) == null) {
                                M.asignaDato(i - 1, j, cont);
                            } else {
                                if (M.retornaDato(i - 1, j) != 0) {
                                    M.asignaDato(i - 1, j, M.retornaDato(i - 1, j) + 1);
                                }
                            }

                            if (M.retornaDatoObj(i + 1, j) == null) {
                                M.asignaDato(i + 1, j, cont);
                            } else {
                                if (M.retornaDato(i + 1, j) != 0) {
                                    M.asignaDato(i + 1, j, M.retornaDato(i + 1, j) + 1);
                                }
                            }

                            for (k = i - 1; k <= i + 1; k++) {
                                for (l = j + 1; l <= j + 1; l++) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }
                            }
                        }

                        if (i != 0 && i != m - 1 && j == n - 1) {
                            if (M.retornaDatoObj(i - 1, j) == null) {
                                M.asignaDato(i - 1, j, cont);
                            } else {
                                if (M.retornaDato(i - 1, j) != 0) {
                                    M.asignaDato(i - 1, j, M.retornaDato(i - 1, j) + 1);
                                }
                            }

                            if (M.retornaDatoObj(i + 1, j) == null) {
                                M.asignaDato(i + 1, j, cont);
                            } else {
                                if (M.retornaDato(i + 1, j) != 0) {
                                    M.asignaDato(i + 1, j, M.retornaDato(i + 1, j) + 1);
                                }
                            }

                            for (k = i - 1; k <= i + 1; k++) {
                                for (l = j - 1; l >= j - 1; l--) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }
                            }
                        }

                        if (i != 0 && i != m - 1 && j != n - 1 && j != 0) {
                            if (M.retornaDatoObj(i - 1, j) == null) {
                                M.asignaDato(i - 1, j, cont);
                            } else {
                                if (M.retornaDato(i - 1, j) != 0) {
                                    M.asignaDato(i - 1, j, M.retornaDato(i - 1, j) + 1);
                                }
                            }

                            if (M.retornaDatoObj(i + 1, j) == null) {
                                M.asignaDato(i + 1, j, cont);
                            } else {
                                if (M.retornaDato(i + 1, j) != 0) {
                                    M.asignaDato(i + 1, j, M.retornaDato(i + 1, j) + 1);
                                }
                            }

                            for (k = i - 1; k <= i + 1; k++) {
                                for (l = j - 1; l <= j + 1; l = l + 2) {
                                    if (M.retornaDatoObj(k, l) == null) {
                                        M.asignaDato(k, l, cont);
                                    } else {
                                        if (M.retornaDato(k, l) != 0) {
                                            M.asignaDato(k, l, M.retornaDato(k, l) + 1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void MuestraMatriz(){
        int i, j;
        for(i = 0; i < m ; i++){
            for(j = 0; j < n ; j++){
                System.out.print(M.retornaDatoObj(i,j) + " ");
            }
            System.out.println();
        }
    }

    public matriz getMatriz(){
        return M;
    }

    public List<Integer> verificaLimites(matriz m, int x, int y){
        List<Integer> adjacente = new ArrayList<>();
        adjacente.add(m.retornaDato(x,y));
        for(int i = -1; i<= 1; i++){
            for(int j = -1; j <= 1; j++){
                if((i != 0) || (j != 0 )){
                    if(x+i >= 0 && y+j >= 0 && x+i < m.getFila() && y+j < m.getColumna()){
                        adjacente.add(m.retornaDato(x+i,y+j));
                    }
                }
            }
        }
        return adjacente;
    }
}
