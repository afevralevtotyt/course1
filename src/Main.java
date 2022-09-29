public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Федоров Федор Федорович", 20000, 1);
        employees[1] = new Employee("Петров Петр Петрович", 20300, 1);
        employees[3] = new Employee("Синицын Воробей Воронович", 16000, 2);

       EmployeeBook employeeBooks = new EmployeeBook(employees);
       employeeBooks.doSalaryIndexationByDep(2, 100);
       employeeBooks.getListOfEmployeesByDep(2);
       employeeBooks.addNewEmployee("Ремесленников Сергей Борисович", 240000, 1);
       employeeBooks.changeEmployee("Синицын Воробей Воронович", 12547, 5);
       employeeBooks.changeEmployee("Ремесленников Сергей Борисович", 20003, 4);
       employeeBooks.printListByDepartment();

    }



}