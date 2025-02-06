package dev.karoene.estudosjavabasico.models;

import dev.karoene.estudosjavabasico.store.PromotionalProduct;

public class LivroFisico extends Livro implements PromotionalProduct {
    private boolean isNew;

    public LivroFisico(String title, int yearRelease, int isbn, Author author, double price, boolean isNew) {
        super(title, yearRelease, isbn, author, price);
        this.isNew = isNew;
    }


    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public double printingTax(){
        return super.getPrice() - (getPrice()*0.5);

    }


    @Override
    public void printFormattedData() {
        super.printFormattedData();
        System.out.println("Estado: " + ((isNew)? "Novo": "Usado"));

    }

    @Override
    public double applyingDiscount(double price) {
        return 0;
    }

}