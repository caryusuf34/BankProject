public class Company {

    protected int companyNo;
    protected String companyName;
    protected String city;
    protected String service;
    protected String aim;
    protected int tax;

    public Company(int companyNo, String companyName, String city, String service, String aim) {
        this.companyNo = companyNo;
        this.companyName = companyName;
        this.city = city;
        this.service = service;
        this.aim = aim;
        this.tax =0;
    }



}
