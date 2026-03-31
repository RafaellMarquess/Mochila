package SistemaInventario.Item;

public class Item {
    private String nome;
    private double volumeLitros;
    private double pesoKg;

    public Item(String item, double volume, double kilos){
        this.nome = item;
        this.volumeLitros = volume;
        this.pesoKg = kilos;

    }

    public String getNome() {
        return nome;
    }

    public double getVolumeLitros(){
        return volumeLitros;
    }

    public double getPesoKg(){
        return pesoKg;
    }

}
