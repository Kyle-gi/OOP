package Exam;

public abstract class Content {
    private int id;
    private String title;
    private double basePrice;
    private int releaseYear;
    private String ageRating;
    private Address address;

    public Content(int id, String title, double basePrice, int releaseYear, String ageRating, Address address) {
        this.id = id;
        this.title = title;
        this.basePrice = basePrice;
        this.releaseYear = releaseYear;
        this.ageRating = ageRating;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getAgeRating() {
        return ageRating;
    }

    public Address getAddress() {
        return address;
    }

    public abstract double calculateRealPrice(boolean isPremium);
}
