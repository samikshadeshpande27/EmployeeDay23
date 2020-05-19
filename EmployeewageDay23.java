class EmployeewageUC9 {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;
        private int totalEmpWage;
        public EmployeewageUC9(String company, int empRatePerHour, int nuingDays, int maxHoursPerMonth) {
                this.company = company;
                this.empRatePerHour = empRatePerHour;
                this.numOfWorkingDays = numOfWorkingDays;
                this.maxHoursPerMonth = maxHoursPerMonth;
        }
        public void computeEmpWage()
        {
                int empHrs = 0;
                int totalEmpHrs = 0;
                int totalWorkingDays = 0;
                while (totalEmpHrs <= maxHoursPerMonth &&
                                totalWorkingDays < numOfWorkingDays){
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
                totalEmpWage = totalEmpHrs * empRatePerHour;
}
        @Override
        public String toString() {
                return "Total Emp Wage for Company: " +company+ " is: " +mpWage;
        }

public static void main(String[] args)
{
        EmployeewageUC9 dMart = new EmployeewageUC9("DMART",20,2,10);
        EmployeewageUC9 reliance= new EmployeewageUC9("RELIANCE",10,4,20)
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
 }
 }

