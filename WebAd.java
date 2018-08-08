import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * The creator of this is Brandon Werner
 */
public class WebAd {
    private double WebAdPrice;
    private int Discount;
    private double Tax;
    private double Total;

    public WebAd() {
       unitPrice();
       discountRate(0,50);
       taxRate(7.25);
       adjustedPRice();
    }
    private void unitPrice()
    {
        Random random=new Random();
        WebAdPrice = 25 + (100 - 25) * random.nextDouble();
        //WebAdPrice=random.nextDouble();
        DecimalFormat df = new DecimalFormat("####0.00");
        WebAdPrice=Double.parseDouble(df.format(WebAdPrice));
        
    }
    private void discountRate(int minimum,int maximum)
    {
        
        Random random=new Random();
        int n=maximum - minimum + 1;    
        int i = (random.nextInt( Integer.MAX_VALUE ) + 1) % n;  
        int RandomNum=minimum+i;    
        this.Discount=RandomNum;
        
    }
    private void taxRate(double rate)
    {
        this.setTax(rate);
    }
    private void adjustedPRice()
    {
        double x=(WebAdPrice*Discount)/100;     
        Total=WebAdPrice-x;                
        x=(WebAdPrice*getTax())/100;            
        Total=WebAdPrice+x;                
        
        DecimalFormat df = new DecimalFormat("####0.00");
        Total=Double.parseDouble(df.format(Total));
    }
    /**
     * This returns the WebAdPrice
     */
    public double getWebAdPrice() {
        return WebAdPrice;
    }

    /**
     * This sets the WebAdPrice
     */
    public void setWebAdPrice(double WebAdPrice) {
        this.WebAdPrice = WebAdPrice;
    }

    /**
     * This returns the discount
     */
    public int getDiscount() {
        return Discount;
    }

    /**
     * This sets the discount
     */
    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

   

    /**
     * This returns the Total
     */
    public double getTotal() {
        return Total;
    }

    /**
     * This sets the Total
     */
    public void setTotal(double Total) {
        this.Total = Total;
    }

    /**
     * This returns the Tax
     */
    public double getTax() {
        return Tax;
    }

    /**
     * This sets the Tax
     */
    public void setTax(double Tax) {
        this.Tax = Tax;
    }
    
}
