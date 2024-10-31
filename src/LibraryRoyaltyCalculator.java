public class LibraryRoyaltyCalculator  {

    public static void main(String[] args) {

        //Created 3 new Author objects
        Author author1 = new Author("William Shakespeare");
        Author author2 = new Author("Franz Kafka");
        Author author3 = new Author("Stephen King");

        //Created 9 new different titles, where 3 of them are Audiobooks
        Title title1 = new Audiobook("Romeo & Juliet", "LYRIK", 1000,250);
        Title title2 = new Printedbook("A Midsummer Night's Dream", "TE", 800,200);
        Title title3 = new Printedbook("Julius Caesar", "FAG", 1200,500);
        Title title4 = new Audiobook("The Metamorphosis", "BI", 1400,500);
        Title title5 = new Printedbook("Letter to His Father", "FAG", 2200,500);
        Title title6 = new Printedbook("The Castle", "SKØN", 1800,500);
        Title title7 = new Audiobook("IT", "LYRIK", 2000,500);
        Title title8 = new Printedbook("Salems Lot", "TE", 2400,500);
        Title title9 = new Printedbook("Misery", "B", 3200,500);


        //Added 3 titles to author1
        author1.addTitle(title1);
        author1.addTitle(title2);
        author1.addTitle(title3);


        //Added 3 titles to author2
        author2.addTitle(title4);
        author2.addTitle(title5);
        author2.addTitle(title6);

        //Added 3 titles to author3
        author3.addTitle(title7);
        author3.addTitle(title8);
        author3.addTitle(title9);


        //Printing out information about the 3 authors.
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);




    }
}
