package model;
import java.util.Random;

class Dados {
    private static final Integer[] dado = {1, 2, 3, 4, 5, 6};

    private static final Integer[] redDado = dado;
    private static final Integer[] yellowDado = dado;

    public static Integer jogarVermelho() {
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(dado.length);
        System.out.println("Dado vermelho (ataque): " + redDado[indiceAleatorio]);
        return redDado[indiceAleatorio];
    }

    public static Integer jogarAmarelo() {
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(dado.length);
        System.out.println("Dado amarelo (defesa): " + yellowDado[indiceAleatorio]);
        return yellowDado[indiceAleatorio];
    }

}
