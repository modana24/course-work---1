public class Main {
    public static void main(String[] args) {

                Employee [] employeesInfo = {
                        new Employee("Иванов Иван",10_000,1),
                        new Employee("Петров Петр", 11_000, 1),
                        new Employee("Денисов Денис",12_000,3),
                        new Employee("Артемов Артем", 13_000, 4),
                        new Employee("Павлов Павел", 14_000, 5),
                        new Employee("Вадимов Вадим", 15_000, 1),
                        new Employee("Максимов Максим", 16_000,2),
                        new Employee("Дмитров Дмитрий", 17_000,3),
                        new Employee("Ильин Илья", 18_000,4),
                        new Employee("Артуров Артур",19_000,5),
                };
                System.out.println("Общая сумма выплат сотрудникам составляет: " + salarySum(employeesInfo));
                System.out.println("Минимальная зарплата в компании составляет: " + findMinSalary(employeesInfo));
                System.out.println("Максимальная зарплата в компании составляет: " + findMaxSalary(employeesInfo));
                System.out.println("Средняя зарплата в компании составляет: " + averageSalary(employeesInfo));

                System.out.println();
                System.out.println("Сотрудники компании:");
                for (int i = 0; i < employeesInfo.length; i++) {
                    System.out.println(employeesInfo[i]);
                }

            }

            private static int salarySum(Employee [] employeesInfo) {
                int sum = 0;
                for (int i = 0; i < employeesInfo.length; i++) {
                    sum += employeesInfo[i].getSalary();
                }
                return sum;
            }

            private static int findMinSalary(Employee [] employeesInfo) {
                int minSalary = employeesInfo[0].getSalary();
                for (int i = 0; i < employeesInfo.length; i++) {
                    if (employeesInfo[i].getSalary() < minSalary) {
                        minSalary = employeesInfo[i].getSalary();
                    }
                }
                return minSalary;
            }

            private static int findMaxSalary(Employee [] employeesInfo) {
                int maxSalary = employeesInfo[0].getSalary();
                for (int i = 0; i < employeesInfo.length; i++) {
                    if (employeesInfo[i].getSalary() > maxSalary) {
                        maxSalary = employeesInfo[i].getSalary();
                    }
                }
                return maxSalary;
            }

            private static int averageSalary(Employee [] employeesInfo) {
                int difference = 0;
                int sum = 0;
                for (int i = 0; i < employeesInfo.length; i++) {
                    sum += employeesInfo[i].getSalary();
                }
                difference = sum / employeesInfo.length;
                return difference;
            }
        }

