public class EmployeeArray {

    public static class Employee {
        String lastName;
        String firstName;
        String middleName;
        String position;
        String email;
        String phoneNumber;
        Double salary;
        int age;


        public Employee(String lastName, String firstName, String middleName, String position,
                        String email, String phoneNumber, Double salary, int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.middleName = middleName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }


        public void printInfo() {
            System.out.println("Фамилия: " + lastName);
            System.out.println("Имя: " + firstName);
            System.out.println("Отчество: " + middleName);
            System.out.println("Должность: " + position);
            System.out.println("E-mail: " + email);
            System.out.println("Телефон: " + phoneNumber);
            System.out.println("Гонорар: " + salary);
            System.out.println("Возраст: " + age);
        }


        public static String formatEmployeeInfo(Employee employee) {
            StringBuilder sb = new StringBuilder();
            sb.append("Фамилия: ").append(employee.lastName).append("\n")
                    .append("Имя: ").append(employee.firstName).append("\n")
                    .append("Отчество: ").append(employee.middleName).append("\n")
                    .append("Должность: ").append(employee.position).append("\n")
                    .append("Email: ").append(employee.email).append("\n")
                    .append("Телефон: ").append(employee.phoneNumber).append("\n")
                    .append("Зарплата: ").append(employee.salary).append("\n")
                    .append("Возраст: ").append(employee.age).append("\n");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов", "Иван", "Иванович", "Программист", "ivan@example.com", "+79123456789", 100000.01, 25);
        employees[1] = new Employee("Петрова", "Мария", "Петровна", "Дизайнер", "maria@design.com", "+79876543210", 80000.0, 30);
        employees[2] = new Employee("Сидоров", "Алексей", "Алексеевич", "Менеджер", "alex@company.com", "+79012345678", 120000.0, 35);
        employees[3] = new Employee("Козлова", "Ольга", "Владимировна", "Бухгалтер", "olga@finance.com", "+79998887776", 95000.0, 28);
        employees[4] = new Employee("Михайлов", "Дмитрий", "Сергеевич", "Аналитик", "dmitry@data.com", "+79112223334", 110000.0, 32);


        for (Employee employee : employees) {
            System.out.println(Employee.formatEmployeeInfo(employee));
        }
    }
}
