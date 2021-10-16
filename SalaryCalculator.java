package week1;
import java.util.Scanner;
    public class SalaryCalculator {

        public static void main(String[] args) {

            int baseSalary;
            double baseWorkingHour = 40;
            double hourlyWage, totalWorkingHour, weekdaysWorkingHour, weekendWorkingHour, finalSalary;


            System.out.print("Enter the base salary: ");
            Scanner scanner = new Scanner(System.in);
            baseSalary = scanner.nextInt();
            hourlyWage = baseSalary / baseWorkingHour;

            while (baseSalary < 1000) {
                System.out.println("Base salary should be >= 1000. Enter a vaild base salary");
                baseSalary = scanner.nextInt();
            }

                System.out.print("Enter your work hours on weekdays: ");
                weekdaysWorkingHour = scanner.nextDouble();
                System.out.print("Enter your work hours on weekend: ");
                weekendWorkingHour = scanner.nextDouble();
                totalWorkingHour = weekdaysWorkingHour + weekendWorkingHour;

                if (totalWorkingHour == baseWorkingHour) {
                    finalSalary = baseSalary;
                    System.out.println("Your salary is base salary : " + finalSalary);
                } else if (totalWorkingHour < baseWorkingHour) {
                    finalSalary = hourlyWage * (weekdaysWorkingHour + weekendWorkingHour);
                    System.out.println("Your salary is less than base salary : " + finalSalary);
                }
                if ((totalWorkingHour >= baseWorkingHour) && (weekendWorkingHour >= 10)) {
                    if ((weekdaysWorkingHour >= 40)) {
                        finalSalary = (baseSalary + (hourlyWage * ((weekdaysWorkingHour - baseWorkingHour) * 1.5)) + (hourlyWage * (weekendWorkingHour * 2)) + 500);
                        System.out.println("Your salary with bonus is  : " + finalSalary);
                    }
                    else{
                        finalSalary = (baseSalary + (hourlyWage  * (totalWorkingHour - baseWorkingHour) * 2));
                        System.out.println("Your salary without bonus is  : " + finalSalary);
                    }
                }
                if ((totalWorkingHour >= baseWorkingHour) && (weekendWorkingHour < 10)) {
                    if (((weekdaysWorkingHour - baseWorkingHour) >= 0)) {
                        finalSalary = (baseSalary + (hourlyWage * ((weekdaysWorkingHour - baseWorkingHour) * 1.5)) + (hourlyWage * ((weekendWorkingHour) * 2)));
                        System.out.println("Your final salary is : " + finalSalary);
                    }
                }

            scanner.close();
        }
    }
