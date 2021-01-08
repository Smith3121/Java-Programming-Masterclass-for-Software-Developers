import java.awt.*;

public class Case {
    private String model;
    private String manufacturer;
    private String powersupply;
    private Dimensions dimension;

    public Case(String model,
                String manufacturer, String powersupply,
                Dimensions dimension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
        this.dimension = dimension;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimensions getDimension() {
        return dimension;
    }

}
