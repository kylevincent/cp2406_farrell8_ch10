/**
 * Created by jc431075 on 15/09/17.
 */
public class Candle
{
    private String color;
    private Integer height;
    protected double price;
    public String getColor()
    {
        return color;
    }
    public Integer getHeight()
    {
        return height;
    }
    public double getPrice()
    {
        return price;
    }
    public void setColor(String a)
    {
        color = a;
    }
    public void setHeight(Integer b)
    {
        height = b;
        price = b * 2;
    }
}
