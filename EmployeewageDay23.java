import java.util.LinkedList;
import java.util.Map;

public interface IComputeEmpWage
{
        public void addcompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);
        public void computeEmpWage();
        public int getTotalWage(String company);
}
public class ComputeEmpWage {
        public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public int totalEmpWage;
        public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
        {
                this.company = company;
                this.empRatePerHour = empRatePerHour;
                this.numOfWorkingDays = numOfWorkingDays;
                this.maxHoursPerMonth = maxHoursPerMonth;
                totalEmpWage = 0;
        }

public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
}
@Override
public String toString() {
        return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
}
}
public class EmployeewageUC14 implement IComputeEmpWage {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private int numOfCompany = 0;
        private LinkedList<CompanyEmpWage>companyEmpWageList;
        private Map<String,CompanyEmpWage>companyToEmpWageMap;

        public EmployeewageUC14() {
                companyEmpWageList = new LinkedList<>();
                companyToEmpWage = new HashMap<>();
        }

        private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
        {
                CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
                companyEmpWageList.add(companyEmpWage);
                companyToEmpWageMap.put(company,companyEmpWage);
        }
        public void computeEmpWage() {
                for(int i = 0; i< numOfCompany; i++) {
                        CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
                        CompanyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
                        System.out.println(companyEmpWage);
                }
        }
        @Override
        public int getTotalWage(String company) {
                return companyToEmpWageMap.get(company).totalEmpWage;
        }
        public int computeEmpWage(CompanyEmpWage computeEmpWage) {...}
public static void main(String[] args)
{
        IComputeEmpWage empwage = new Employeewage14();
        employeewageUC14.addCompanyEmpWage("DMART",20,2,10);
        employeewageUC14.addCompanyEmpWage("RELIANCE",10,4,20);
        employeewageUC14.computeEmpWage();
        System.out.println("Total Wage For Dmart Company:" +employeewageUC14.getTotalWage("DMart"));
 }
 }

