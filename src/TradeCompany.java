public class TradeCompany extends Company implements IPayment{
    public TradeCompany(int companyNo, String companyName, String city, String service, String aim) {
        super(companyNo, companyName, city, service, aim);
    }

    @Override
    public int tax() {
        return super.tax=20;
    }
    @Override
    public String toString() {
        return "Company{" +
                "companyNo=" + this.companyNo +
                ", companyName='" + this.companyName + '\'' +
                ", city='" + this.city + '\'' +
                ", service='" + this.service + '\'' +
                ", aim='" + this.aim + '\'' +
                ", tax=" + this.tax +
                '}';
    }










}
