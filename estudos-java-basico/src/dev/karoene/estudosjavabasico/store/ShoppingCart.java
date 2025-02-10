package dev.karoene.estudosjavabasico.store;

import dev.karoene.estudosjavabasico.models.*;

public class ShoppingCart {
    private int quantItens;
    private int sellID;
    private PromotionalProduct[] produtos = new PromotionalProduct[5];

    public ShoppingCart(int sellID){
        this.sellID = sellID;
    }

    //GET E SETS necessarios
    public int getQuantItens() {
        return quantItens;
    }
    public void setQuantItens() {
        this.quantItens++;
    }
    public int getSellID() {
        return sellID;
    }


    public boolean add(PromotionalProduct produto){
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                produtos[i] = produto;
                break;
            }else{
                System.out.println("Carrinho com capacidade maxima");
            }
        }
        return true;
    }
    public void showCart(){
        for (PromotionalProduct obj: produtos){
            System.out.println(obj);

        }
    }


}
