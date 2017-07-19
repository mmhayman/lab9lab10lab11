/**
 * Created by michelhayman on 7/18/17.
 */
public class UsedCar extends Car {

    public UsedCar(String make, String model, int year, double price, double mileage) {
        super(make, model, year, price);
        this.mileage = mileage;
    }
    public UsedCar () {

    }

    private double mileage = 0.0;

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public UsedCar(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String getMake() {
        return super.getMake( );
    }

    @Override
    public void setMake(String make) {
        super.setMake(make);
    }

    @Override
    public String getModel() {
        return super.getModel( );
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getYear() {
        return super.getYear( );
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public double getPrice() {
        return super.getPrice( );
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "mileage=" + mileage +
                '}';
    }
}
