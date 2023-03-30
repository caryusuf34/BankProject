import java.util.ArrayList;
import java.util.Scanner;

public class Holding {
    private String HoldingName;
    private ArrayList<Company> companies;
    private Scanner imput;

    public Holding(){
        this.HoldingName="Humanity Holding";
        this.companies=new ArrayList<>();
        this.imput=new Scanner(System.in);

    }


    public Company createCompany(){

        System.out.println("Company No :");
        int CompanyNo=imput.nextInt();
        System.out.println("CompanyName:");
        String CompanyName=imput.nextLine();
        imput.nextLine();
        System.out.println("City:");
        String City=imput.nextLine();
        System.out.println("Service:");
        String Service=imput.nextLine();
        System.out.println("Aim:");
        String Aim=imput.next();

        Company newCompany;
        if (Aim.equals("Volunteer")){
            newCompany=new VolunteerCompany(CompanyNo,CompanyName,City,Service,Aim);
        } else {
            newCompany=new TradeCompany(CompanyNo,CompanyName,City,Service,Aim);
        }
        return newCompany;
    }
    public void addCompany(){
        Company newcompany=createCompany();
        boolean control=false;

        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).companyNo == newcompany.companyNo) {
                control=true;
            }
        }
        if (!control) {
            this.companies.add(newcompany);
            System.out.println("şirket başarıyla eklendi ");
        }
/*
        int count=0;
        for (Company company:companies){
            if (company.companyNo==newcompany.companyNo){
                count ++;
                break;
            }
        }
        if (count==0){
            this.companies.add(newcompany);
            System.out.println("şirket başarıyla eklendi ");
        }else{
            System.out.println("şirket zaten mevcut");
        }

 */
    }
    public void listCompany(){
        System.out.println("Holding Name  :"+this.HoldingName);
        if (this.companies.isEmpty()){
            System.out.println("Lüten listeye şirket ekleyiniz ");
        }else {
            int sayac=1;
            for (Company company:companies){
                System.out.println(sayac+". Şirket " +company.companyName);
                System.out.println(company);
                sayac ++;
            }
        }

    }
    public void removeCompany(){
        System.out.println("Silmek istediğiniz şirketin company no'sunu giriniz ;");
        int CompanyNoo=imput.nextInt();
        boolean control=false;
        for (Company company:companies){
            if (company.companyNo==CompanyNoo){
                companies.remove(company);
                control= true;
                break;

            }

        }
        if (control){
            System.out.println("silmek istedinğiz şirket numarasına ait bir şirket bulunmamaktadır");
        }

    }




}

