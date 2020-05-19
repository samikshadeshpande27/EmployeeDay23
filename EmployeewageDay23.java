class CompanyEmpWage
{
        public final String company;
        public final int empRatePerHour;
        public final int numOfWorkingDays;
        public final int maxHoursPerMonth;
        public int totalEmpWage;
        public CompanyEmpWage(String company, int empRatePerHour, int numngDays, int maxHoursPerMonth) {
                this.company = company;
                this.empRatePerHour = empRatePerHour;
                this.numOfWorkingDays = numOfWorkingDays;
                this.maxHoursPerMonth = maxHoursPerMonth;
        }

public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
}
@Override
public String toString() {
        return "Total Emp Wage for Company: " +company+ " is: " + totalEm
}
}
public class EmployeewageUC10 {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private int numOfCompany = 0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmployeewageUC10() {
                companyEmpWageArray = new CompanyEmpWage[5];

        }
        private void addCompanyEmpWage(String company, int empRatePerHourumOfWorkingDays, int maxHoursPerMonth)
        {
                companyEmpWageArray[numOfCompany] = new CompanyEmpWage(compRatePerHour,numOfWorkingDays,maxHoursPerMonth);
                numOfCompany++;
        }
        private void computeEmpWage() {
                for(int i = 0; i< numOfCompany; i++) {
                        companyEmpWageArray[i].setTotalEmpWage(this.compuge(companyEmpWageArray[i]));
                        System.out.println(companyEmpWageArray[i]);
                }
        }
        private int computeEmpWage(CompanyEmpWage companyEmpWage) {
                int empHrs =0, totalEmpHrs = 0, totalWorkingDays = 0;
                while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
                                totalWorkingDays < companyEmpWage.numOfWoys){
                        totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck)
                {
                        case IS_PART_TIME:
                                empHrs = 4;
                                break;
                        case IS_FULL_TIME :
                                empHrs = 8;
                                break;
                                default:
                                        empHrs = 0;
                }
                totalEmpHrs += empHrs;
                System.out.println("Day#: " + totalWorkingDays + "Emp Hr:Hrs);
        }
                return totalEmpHrs * companyEmpWage.empRatePerHour;
}
public static void main(String[] args)
{
        EmployeewageUC10 empwage = new EmployeewageUC10();
        empwage.addCompanyEmpWage("DMART",20,2,10);
        empwage.addCompanyEmpWage("RELIANCE",10,4,20);
        empwage.computeEmpWage();
 }
 }

