package poo;

public class Contador {

    private  int valor;

    public Contador(){
        this.valor = 0;
    }

    public void incrementa(){
        this.valor += 1;
    }

    public  int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

}
