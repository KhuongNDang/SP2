public abstract class Title{

    String title;
    String literatureType;
    int copies;
    double rate = 0.067574;


    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;

    }

    //A method that calculates the royalty and rounds it up to 2 decimals
    double calculateRoyalty() {
        double royalty = rate * calculatePoints();
        return Math.round(royalty * 100.0) / 100.0;
    }

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints(String literatureType);

}
