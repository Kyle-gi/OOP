package Exam;

public class Movie extends Content{

    private int durationMinutes;
    private boolean isNewRelease;
    private String genre;

    public Movie(int id, String title, double basePrice, int releaseYear, String ageRating, Address address, int durationMinutes, boolean isNewRelease, String genre) {
        super(id, title, basePrice, releaseYear, ageRating, address);
        this.durationMinutes = durationMinutes;
        this.isNewRelease = isNewRelease;
        this.genre = genre;
    }


    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isNewRelease() {
        return isNewRelease;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void setNewRelease(boolean newRelease) {
        isNewRelease = newRelease;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public double calculateRealPrice(boolean isPremium) {
        double price = getBasePrice();

        if (isNewRelease) {
            price = price + (price * 0.20);
        }

        if (durationMinutes > 150){
            price = price + (price * 0.05);
        }

        if (isPremium){
            price = price + (price * 0.40);
        }
        return price;
    }
}
