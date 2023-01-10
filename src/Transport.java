public class Transport {
    private String brand;
    private String model;
    private final int year;
    private final String country;
    private String color;
    private Integer maxSpeed;

    public Transport(String brand, String model, String color, Integer maxSpeed) {
        this.country = "Russia";
        this.year = 2020;

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "unknown";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "unknown";
        } else {
            this.model = model;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "unknown";
        } else {
            this.color = color;
        }
        if (maxSpeed == null || color.isEmpty()) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "unknown";
        } else {
            this.brand = brand;
        }


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "unknown";
        } else {
            this.model = model;
        }
    }

    public String getCountry() {
        return country;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "unknown";
        } else {
            this.color = color;
        }
    }

    public Integer getYear() {
        return year;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {


        if (maxSpeed == null || color.isEmpty()) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }

    }


    @Override
    public String toString() {
        return "год производства:" + this.getYear() +
                ", страна сборки:" + this.getCountry() +
                ", марка:" + this.getBrand() +
                ", модель:" + this.getModel() +
                ", цвет кузова:" + this.getColor() +
                ", макс скорость:" + this.getMaxSpeed();


    }
}
