public static class Library {




    public static class Author{
        String name;
        String email;

        public Author(String name , String email){
            this.name = name;
            this.email = email;
        }
    }
public static class Book{
        String name;
        int year;
    Author author;
       double price;

       public Book(String name , int year , Author author , double price){
           this.name= name;
           this.year = year;
           this.author = author;
           this.price = price;
       }
}
}
    public static void main(String[] args){

    Library.Author a = new Library.Author("Ion Creanga" , "Creanga@gmail.com" );
Library.Book b = new Library.Book("Amintiri din copilarie " , 1892 , a , 15.55);

    System.out.println("Book " + b.name + "price " + b.price + " Ron " + " by " + b.author.name + " published in year " + b.year);



}







