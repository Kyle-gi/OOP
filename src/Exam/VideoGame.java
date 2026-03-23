package Exam;

public class VideoGame extends Content{

    private String platform;
    private boolean isMultiplayer;
    private double sizeGB;

    public VideoGame(int id, String title, double basePrice, int releaseYear, String ageRating, Address address, String platform, boolean isMultiplayer, double sizeGB) {
        super(id, title, basePrice, releaseYear, ageRating, address);
        this.platform = platform;
        this.isMultiplayer = isMultiplayer;
        this.sizeGB = sizeGB;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public boolean isMultiplayer() {
        return isMultiplayer;
    }

    public void setMultiplayer(boolean multiplayer) {
        isMultiplayer = multiplayer;
    }

    public double getSizeGB() {
        return sizeGB;
    }

    public void setSizeGB(double sizeGB) {
        this.sizeGB = sizeGB;
    }

    @Override
    public double calculateRealPrice(boolean isPremium) {
        double price = getBasePrice();

        if (isMultiplayer) {
            price = price + (price * 0.10);
        }

        double percentFromSize = (sizeGB / 10) / 100.0;
        price = price * (1 + percentFromSize);

        if (isPremium){
            price = price + (price * 0.40);
        }

        return price;
    }
}
