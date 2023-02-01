public class Car extends Transport {

    private double engineVolume; // Объем двигателя в литрах
    private String transmission; // Коробка передачь
    private String registrationNumber; // Регистроционный номер
    private final int numberSeats; // Количество мест
    private final String bodyType; // Тип кузова

    public Car(double engineVolume, String transmission, String registrationNumber, int numberSeats, String bodyType) {
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.registrationNumber = registrationNumber;
        this.numberSeats = numberSeats;
        this.bodyType = bodyType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume == 0 ? 3 : engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null ? "автоматик" : transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber == null ? "sd123lv" : registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberSeats=" + numberSeats +
                ", bodyType='" + bodyType + '\'' +
                '}';
    }
}






