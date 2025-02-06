package dev.karoene.estudosjavabasico.store;

import dev.karoene.estudosjavabasico.models.*;

public class ShoppingCart {
    private int quantItens;
    private int sellID;

    public ShoppingCart(int sellID){
        this.sellID = sellID;
    }




    public int getQuantItens() {
        return quantItens;
    }

    public void setQuantItens() {
        this.quantItens++;
    }
    public int getSellID() {
        return sellID;
    }


    public boolean add(LivroFisico livro){
        livro.getTitle();
        return true;
    }



}
