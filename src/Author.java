
import java.util.ArrayList;

public class Author {

    public String name;
    public ArrayList<Title> titles;


    //A constructor that initializes a new Author object with a given name and creates an empty list to store the author’s titles
    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();

    }

    //A method that adds a title to the Authors list of titles
    public void addTitle(Title title) {
        titles.add(title);
    }

    //A method that goes through the list Title and calculates the total royalty for all titles
    float calculateTotalPay() {
        float totalpay = 0;

        for (Title title : titles) {
            totalpay += title.calculateRoyalty();

        }
        return totalpay;
    }

    //A toString method that helps print out the information
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Author: ").append(name).append("\nTitles:\n");
        for (Title title : titles) {
            sb.append("- ").append(title.title).append(" (").append(title.literatureType).append(", Copies: ").append(title.copies).append(" - royalty: ").append(title.calculateRoyalty()).append(")\n");

        }
        System.out.println("\n");
        sb.append("Total royalty pay: ").append(calculateTotalPay()).append("\n");
        return sb.toString();
    }

}
