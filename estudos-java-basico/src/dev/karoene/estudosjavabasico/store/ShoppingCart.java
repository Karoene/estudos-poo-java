package dev.karoene.estudosjavabasico.store;

public class ShoppingCart {
    private int quantItens = 0;
    private int sellID;
    private double totalPrice;
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


    public void add(PromotionalProduct produto){
        for(int i = 0; i < produtos.length; i++){
            if(produtos[i] == null){
                produtos[i] = produto;
                System.out.println("inserido");
                quantItens++;
                totalPrice += produto.price();
                break;
            }else if (quantItens >= produtos.length) {
                System.out.println("Carrinho cheio");
                break;
            }             
        }
        
    }
    public void showCart(){
        for (PromotionalProduct obj: produtos){
            System.out.println(obj);
        }
        System.out.println("Total da compra: " + totalPrice);
    }
    


}
