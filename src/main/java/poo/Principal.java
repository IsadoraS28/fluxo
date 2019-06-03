package poo;

public class Principal {

    /*public static void main(String[] args) {
        Thread comHerança = new Fluxo1();
        Thread comInterface  = new Thread(new Fluxo2());

        System.err.println("Iniciando");

        comHerança.start();

        try{
            comHerança.join();
            System.err.println("Depois join");
        }catch (InterruptedException ex){
            System.err.println(ex.toString());
        }

        comInterface.start();

        System.err.println("Finalizado");
    }*/

    public static void main(String[] args) {

        Contador c = new Contador();

        Thread f1 = new Fluxo1(c);
        Thread f2  = new Thread(new Fluxo2(c));

        f1.start();
        f2.start();

    }

}
