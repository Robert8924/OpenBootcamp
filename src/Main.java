public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.Incrementar_Puerta();
        System.out.println(miCoche.Numero_Puerta);
    }

}
class Coche{
    public int Numero_Puerta=0;
    public void Incrementar_Puerta(){
        this.Numero_Puerta++;
    }
}