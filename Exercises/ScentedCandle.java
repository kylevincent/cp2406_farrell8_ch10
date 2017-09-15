/**
 * Created by jc431075 on 15/09/17.
 */
public class ScentedCandle extends Candle {
    private String scent;
    public String getScent()
    {
        return scent;
    }
    private void setScent(String x)
    {
        this.scent = x;
    }
    @Override
    public void setHeight(int z)
    {
        super.setHeight(z);
        price = z * 3;
    }
}
