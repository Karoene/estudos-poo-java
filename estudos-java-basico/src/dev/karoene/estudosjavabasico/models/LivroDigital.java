package dev.karoene.estudosjavabasico.models;

import dev.karoene.estudosjavabasico.store.PromotionalProduct;

public class LivroDigital extends Livro implements PromotionalProduct {
    private double fileSizeMB;

    public LivroDigital(String title, int yearRelease, int isbn, Author author, double price, double fileSizeMB) {
        super(title, yearRelease, isbn, author, price);
        this.fileSizeMB = fileSizeMB;
    }


    public double getFileSizeMB() {
        return fileSizeMB;
    }
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }


    @Override
    public double applyingDiscount(double discount) {
        double finalPrice = getPrice() - (getPrice()*discount);
        return finalPrice;
    }

    @Override
    public void printFormattedData() {
        super.printFormattedData();
        System.out.println("size: " + getFileSizeMB());
    }
}
