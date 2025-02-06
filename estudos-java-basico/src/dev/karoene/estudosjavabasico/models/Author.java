package dev.karoene.estudosjavabasico.models;
public class Author {
    private String name;
    private String emailAdress;

    //public Author(){}

    public Author(String name, String emailAdress){
        this.name = name;
        this.emailAdress = emailAdress;
        System.out.println("Objeto author criado com sucesso!");
    }

    public String getEmailAdress() {
        return emailAdress;
    }
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printFormattedData(){
        System.out.println("Nome do autor: "+ name);
        System.out.println("Email do autor: "+ emailAdress);
    }
}