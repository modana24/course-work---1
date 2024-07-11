import java.util.Objects;

public class Employee {
        private String fullName;
        private int salary;
        private int departmentNumber;

        private int id;
        private static int counter = 0;

        public Employee(String fullName, int salary, int departmentNumber) {
            this.fullName = fullName;
            this.salary = salary;
            this.departmentNumber = departmentNumber;

            ++counter;
            id = counter;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getDepartmentNumber() {
            return departmentNumber;
        }

        public void setDepartmentNumber(int departmentNumber) {
            this.departmentNumber = departmentNumber;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Double.compare(salary, employee.salary) == 0 && departmentNumber == employee.departmentNumber && Objects.equals(fullName, employee.fullName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(fullName, salary, departmentNumber);
        }

        @Override
        public String toString() {
            return "ФИ: " + fullName + ". "
                    + "Зарплата: " + salary + ". "
                    + "Отдел: " + departmentNumber + ". "
                    + "Id: " + id;
        }
    }
