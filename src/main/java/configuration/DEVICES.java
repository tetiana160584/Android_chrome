package configuration;

public enum DEVICES {
    Pixel_4("Pixel_4"),
    Pixel_6("Pixel_6");

     String getName() {
        return name;
    }

    private String name;

    DEVICES(String name) {
        this.name = name;
    }

}