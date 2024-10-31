public class Printedbook extends Title{

   int pages;



    public Printedbook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    //A method that calculate the  total amount of points for a title
    @Override
    protected double calculatePoints(){

        return copies * pages * calculateLiteraturePoints(literatureType);

    }

    //A switch case that matches the users input with 5 different cases
    @Override
    protected double calculateLiteraturePoints(String literatureType){
        double value;

        switch (literatureType) {
            case "BI":
                value = 3;
                break;
            case "TE":
                value = 3;
                break;
            case "LYRIK":
                value = 6;
                break;
            case "SKØN":
                value = 1.7;
                break;
            case "FAG":
                value = 1;
                break;
            default:
                value = 0; // Default value if no match
                break;
        }
        return value;
    }
}

