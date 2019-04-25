package br.com.digitalhouse;

public class Principal4Exe6 {
    public static void main(String[] args) {
        int [] numeros = new int[]{1,5,4,2,7,8,9,6,3,10,15,16};
        int [] recebe;


        int par = 0;
        for (int i=0; i < numeros.length; i++) {
            par = (numeros[i] % 2);
            if (par == 0) {
                System.out.println("Numeros Pares ==============> " + numeros[i] + " <=========");
            }
        }
    }
}
