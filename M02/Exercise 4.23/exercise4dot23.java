import java.util.Scanner;

public class exercise4dot23 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the employee's name: ");
            String employeeName = scanner.nextLine();

            System.out.println("Enter the number of hours worked in a week: ");
            double hoursWorked = scanner.nextDouble();

            System.out.println("Enter the hourly pay rate: ");
            double hourlyPayRate = scanner.nextDouble();

            System.out.println("Enter the federal tax withhold rate(EX: .20): ");
            double federalTaxWithholdRate = scanner.nextDouble();

            System.out.println("Enter the state tax withholding rate(EX:0.09): ");
            double stateTaxWithholdRate = scanner.nextDouble();

            // Declaring variables

            double grossPay = (hoursWorked * hourlyPayRate);

            System.out.println("\nEmployee's Name: " + employeeName);
            System.out.println("Hours Worked: " + hoursWorked);
            System.out.println("Hourly Pay Rate: " + hourlyPayRate);
            System.out.println("Gross Pay: $" + (hoursWorked * hourlyPayRate));
            System.out.println("Deductions:");
            System.out.println("    Federal Withholding (" + federalTaxWithholdRate * 100 + "%): $" + (grossPay * federalTaxWithholdRate));
            System.out.println("    State Withholding (" + stateTaxWithholdRate * 100 + "%): $" + (grossPay * stateTaxWithholdRate));
            System.out.println("    Total Deduction: $" + (grossPay * federalTaxWithholdRate + grossPay * stateTaxWithholdRate));
            System.out.println("Net Pay: $" + (grossPay - (grossPay * federalTaxWithholdRate + grossPay * stateTaxWithholdRate)));
            
        }


    }
}
