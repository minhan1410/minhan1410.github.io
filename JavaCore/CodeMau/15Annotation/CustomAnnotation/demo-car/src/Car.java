public class Car {
    @JsonField("manufacturer")  //Sử dụng với giá trị rõ ràng
    private final String make;

    @JsonField  //Sử dụng với giá trị mặc định
    private final String model;

    private final String year;

    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    // @Override
    // public String toString() {
    //     return year + " - " + make + " - " + model;
    // }


}
