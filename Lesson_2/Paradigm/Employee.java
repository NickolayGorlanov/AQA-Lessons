public class Employee  {
     String lastName;;
     String firstName;;
     String middleName;;
     String position;;
     String email;;
     String phoneNumber;;
     Double salary;
     int age;

     public Employee (String lastName, String firstName, String middleName, String position, String email, String phoneNumber, Double salary, int age){
         this.lastName = lastName;
         this.firstName = firstName;
         this.middleName = middleName;
         this.position = position;
         this.email = email;
         this.phoneNumber = phoneNumber;
         this.salary = salary;
         this.age = age;
     }

    public void printInfo(){
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Должность: " + position);
        System.out.println("E-mail: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Гонорар: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
     Employee employee = new Employee("Иванов", "Иван", "Иванович",
             "Dude", "dude2024@email.inf", "+71234567890", 200000.01, 25);
     employee.printInfo();
    }

}
