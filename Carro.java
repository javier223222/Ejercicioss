public class Carro {
    int puertas=0;
    public void incrementar(int numero){
        this.puertas=puertas+numero;
        System.out.println(puertas);
    }
    public static void main(String[] args) {
        Carro miCarro=new Carro();
        miCarro.incrementar(23);
    }
}
