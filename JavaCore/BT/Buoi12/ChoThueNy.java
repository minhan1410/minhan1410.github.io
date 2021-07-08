import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class ChoThueNy extends Person {
    private int price;
    private int amountSale;

    public ChoThueNy(String name, int age, String address, int price, int amountSale) {
        super(name, age, address);
        this.price = price;
        this.amountSale = amountSale;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    @Override
    public String toString() {
        Locale locale = new Locale("en", "EN");
        String pattern = "###,###.##";
        DecimalFormat decimalFormat = (DecimalFormat)NumberFormat.getNumberInstance(locale);
        decimalFormat.applyPattern(pattern); 
            
        return "ChoThueNy [ " + "(Thong tin ca nhan: " + super.toString() + "), so lan dc thue=" + amountSale
                + ", gia thue=" + decimalFormat.format(price) + "]";
    }

}
