public class VolunteerCompany extends Company implements IPayment{
    public VolunteerCompany(int companyNo, String companyName, String city, String service, String aim) {
        super(companyNo, companyName, city, service, aim);
    }

    @Override
    public int tax() {
        return super.tax=5;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyNo=" + this.companyNo +
                ", \ncompanyName='" + this.companyName + '\'' +
                ", \ncity='" + this.city + '\'' +
                ", \nservice='" + this.service + '\'' +
                ", \naim='" + this.aim + '\'' +
                ", \ntax=" + this.tax +
                '}';
    }

}
