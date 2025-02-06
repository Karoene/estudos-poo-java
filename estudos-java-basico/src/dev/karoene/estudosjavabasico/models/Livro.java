package dev.karoene.estudosjavabasico.models;

public abstract class Livro {
    private String title;
    private int yearRelease;
    private int isbn;
    private double price;
    private Author author;

    //public Livro(){}

     public Livro(String title, int yearRelease, int isbn, Author author, double price){
        this.title = title;
        this.yearRelease = yearRelease;
        this.isbn = isbn;
        this.author = author;
        this.price = price;
        System.out.println("Objeto livro criado com sucesso!");
        author.setName("");
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getYearRelease(){
        return yearRelease;
    }
    public void setYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
    }
    public int getIsbn(){
        return isbn;
    }
    public void setIsbn(int isbn){
        this.isbn = isbn;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        System.out.println(price);
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }



    public void printFormattedData(){
        System.out.println("---- Dados do livro------");
        System.out.println("Titulo: " + this.title);
        System.out.println("Ano de Lançamento: "+ this.yearRelease);
        System.out.println("Codigo: " + this.isbn);
        author.printFormattedData();
        System.out.println("-----------------------");

    }


}