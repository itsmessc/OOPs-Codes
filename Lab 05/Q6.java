/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
class Book{
    String name, author, edition;
    Book(){
        name="";author="";edition="";
    }
    Book(String name,String author,String edition){
        this.name=name;
        this.author=author;
        this.edition=edition;
    }
    void sameauthor(String author){
        if(this.author==author)
            System.out.println(this.name);
    }
}
public class Q6 {
    public static void main(String args[]){
        Book books[]=new Book[6];
        for(int i=0;i<books.length;i++){
            books[i]= new Book("Yaaash "+String.valueOf(i),"aaahchoo",String.valueOf(i));
        }
        for(int i=0;i<books.length;i++){
            books[i].sameauthor("aaahchoo");
        }
    }
    
}
