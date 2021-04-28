package sample;

public class matriz {
    public int fila, columna;
    public Object[][] M;

    public matriz(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        M = new Object[fila][columna];
    }

    void asignaDato(int f, int c, Object v){
        M[f][c] = v;
    }

    int retornaDato(int f, int c){
        int v;
        v = (int) M[f][c];
        return v;
    }

    Object retornaDatoObj(int f, int c){
        Object x;
        x = M[f][c];
        return x;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }


    matrizEnTripletas construyeMatrizEnTripletas(int f, int c){
        matrizEnTripletas a;
        int cont;
        Object d2;
        tripleta t = new tripleta(f,c,null);
        a = new matrizEnTripletas(t);
        cont = 0;
        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                if(retornaDatoObj(i,j) == null) {
                    d2 = retornaDatoObj(i, j);
                    cont = cont + 1;
                    t = new tripleta(i, j, d2);
                    a.asignaTripleta(t, cont);
                } else {
                    d2 = retornaDato(i,j);
                    cont = cont + 1;
                    t = new tripleta(i, j, d2);
                    a.asignaTripleta(t, cont);
                }
            }
        }
        a.asignaNumeroTripletas(cont);
        return a;
    }


}
