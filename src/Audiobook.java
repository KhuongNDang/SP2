public class Audiobook extends Title {

    int durationInMinutes;



    public Audiobook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;

    }

    //A method that calculate the  total amount of points for a title
    @Override
    protected double calculatePoints(){
        return copies * durationInMinutes * calculateLiteraturePoints(literatureType);

    }

    //A switch case that matches the users input with 5 different cases
    @Override
   protected double calculateLiteraturePoints(String literaturePoints){
        double value;

        switch (literaturePoints) {
            case "BI":
                value = 1.5;
                break;
            case "TE":
                value = 1.5;
                break;
            case "LYRIK":
                value = 3;
                break;
            case "SKØN":
                value = 0.85;
                break;
            case "FAG":
                value = 0.5;
                break;
            default:
                value = 0; // Default value if no match

        }
        return value;

    }
}

