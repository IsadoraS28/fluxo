package poo;

import java.util.Random;

public class Fluxo2 implements Runnable{

    private Random r = new Random();
    private Contador c;

    public Fluxo2(Contador c){
        this.c = c;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {

            System.err.println(i + "2 - F2: " + this.c.getValor());
            this.c.incrementa();
            System.err.println(i + "2 - F2: " + this.c.getValor());

            /*try{
                Thread.sleep(r.nextInt(2000) + 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }*/
        }
    }

}
