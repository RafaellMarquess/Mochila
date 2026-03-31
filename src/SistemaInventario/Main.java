package SistemaInventario;

import SistemaInventario.Item.Item;
import SistemaInventario.Mochila.Mochila;

public class Main {
    public static void main (String[] args){
        Mochila mochila1 = new Mochila("Mochila Militar I", 50.0, 30.0);

        Item facaMilitar = new Item("Faca Militar", 5.0, 4.0);
        Item lataComida1 = new Item("milho valverde", 51.0, 40.0);
        Item lataComida2 = new Item("feijão calabria", 3.0, 5.0);
        Item salgadinho1 = new Item("Doritos", 1.0, 0.7);

        mochila1.quardarItem(facaMilitar);
        mochila1.quardarItem(lataComida1);
        mochila1.quardarItem(lataComida2);
        mochila1.quardarItem(salgadinho1);
        mochila1.exibirInventario();
        mochila1.espacoRestante();
        mochila1.pesoRestante();
        mochila1.removerItemPorNome("Faca Militar");
    }
}