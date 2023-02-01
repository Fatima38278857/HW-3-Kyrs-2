public  class  Transport {




    private String brand;  // Бренд
        private String model; // Модель
        private int yearManufacture ; // Год производства
        private String countryManufacture ; // Страна сборки
        private String bodyColor; // Цвет кузова
        private int maximumMovementSpeed; // Максимальная скорость


    public Transport() {
        super();

    }

    public Transport(String brand, String model, int yearManufacture, String countryManufacture, String bodyColor, int maximumMovementSpeed) {
        this.brand = "Toyota";
        this.model = " model";
        this.yearManufacture = 2005;
        this.countryManufacture = "Germany";
        this.bodyColor = "black";
        this.maximumMovementSpeed = 95;
    }


    public String getBrand() {
        return brand ;
    }

    public String getModel() {
        return model;
    }

    public int getYearManufacture() {
        return yearManufacture  ;
    }

    public String getCountryManufacture() {
        return countryManufacture;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public int getMaximumMovementSpeed() {
        return maximumMovementSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? "Toyota" : brand;
    }

    public void setModel(String model) {
        this.model = model == null ? "SA" : model;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor == null ? "Black" : bodyColor;
    }

    public void setMaximumMovementSpeed(int maximumMovementSpeed) {
        this.maximumMovementSpeed = maximumMovementSpeed == 0 ? 95 : maximumMovementSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", countryManufacture='" + countryManufacture + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maximumMovementSpeed=" + maximumMovementSpeed +
                '}';
    }
}
