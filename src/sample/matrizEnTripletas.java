package sample;

public class matrizEnTripletas {
    public tripleta V[];

    public matrizEnTripletas(tripleta t) {
        int m = t.getFila();
        int n = t.getColumna();
        int p = m * n + 2;
        int i;
        V = new tripleta[p];
        V[0] = t;
        for(i = 1; i < p ; i++){
            V[i] = null;
        }
    }

    public void asignaTripleta(tripleta tx, int i){
        V[i] = tx;
    }

    void asignaNumeroTripletas(int n){
        tripleta t = V[0];
        t.setValor(n);
        V[0] = t;
    }

    public matriz construyeMatriz(){
        int f, c;
        Object v;
        tripleta t;
        matriz a;
        f = retornaNroFilas();
        c = retornaNroColumnas();
        v = retornaNroTripletas();
        a = new matriz(f, c);
        for(int i = 1; i <= (int) v; i++){
            t = retornaTripleta(i);
            a.asignaDato(t.getFila(),t.getColumna(),t.getValor());
        }
        return a;
    }

    int retornaNroFilas(){
        tripleta t = V[0];
        return t.getFila();
    }

    int retornaNroColumnas(){
        tripleta t = V[0];
        return t.getColumna();
    }

    Object retornaNroTripletas(){
        tripleta t = V[0];
        return t.getValor();
    }

    tripleta retornaTripleta(int i){
        return V[i];
    }


}
