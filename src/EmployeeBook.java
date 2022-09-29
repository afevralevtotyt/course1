public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(Employee[] employees) {
        this.employees = employees;
    }

    public void getListOfEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }

        }
    }

    public int sumExpenses() {
        int sum = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Суммарные затраты на зарплату равны " + sum);
        return sum;
    }

    public void searchMinSalary() {
        int min = 1000000;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    count = i;
                }
            }

        }
        System.out.println("Минимальное жалование " + min + " у сотрудника " + employees[count].getFullName());
    }

    public void searchMaxSalary() {
        int max = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    count = i;
                }
            }

        }
        System.out.println("Максимальное жалование " + max + " у сотрудника " + employees[count].getFullName());
    }

    public void getAverageSalary() {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                count += 1;
            }
        }
        System.out.println("Среднее жалование в нашей компании " + sumExpenses() * 1.0 / count);
    }

    public void printFullnames() {
        System.out.println("ФИО всех сотрудников нашей компании");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].getFullName());
            }
        }
    }

    public void doSalaryIndexation(int index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                employees[i].setSalary((int) (employees[i].getSalary() + employees[i].getSalary() * index / 100));
            }
        }
    }

    public void searchMinSalaryByDep(int d) {
        int min = 1000000000;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == d && employees[i].getSalary() < min) {
                    min = employees[i].getSalary();
                    count = i;
                }
            }
        }
        System.out.println("Сотудник с минимальной зарплатой из отдела " + d + " " + employees[count].getFullName() + " " +
                "получает " + employees[count].getSalary());
    }

    public void searchMaxSalaryByDep(int d) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getDepartment() == d && employees[i].getSalary() > max) {
                    max = employees[i].getSalary();
                    count = i;
                }
            }
        }
        System.out.println("Сотудник с максимальной зарплатой из отдела " + d + " " + employees[count].getFullName() + " " +
                "получает " + employees[count].getSalary());
    }

    public int sumExpensesByDep(int d) {
        int sum = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == d) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Суммарные затраты на зарплату равны " + sum);
        return sum;
    }

    public void getAverageSalaryByDep(int d) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == d) {
                count += 1;
            }
        }
        System.out.println("Среднее жалование в отделе " + d + " " + sumExpensesByDep( d) * 1.0 / count);


    }

    public void doSalaryIndexationByDep(int d, int index) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == d) {
                employees[i].setSalary((int) (employees[i].getSalary() + employees[i].getSalary() * index / 100));
            }
        }
    }

    public void getListOfEmployeesByDep(int d) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getDepartment() == d) {
                System.out.println(employees[i].toStringByDep());
            }

        }
    }

    public void searchSmallerSalary(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < number) {
                System.out.println("Сотрудник c ID=" + employees[i].getId() + " " + employees[i].getFullName() + " получает " +
                        +employees[i].getSalary());
            }
        }

    }

    public void searchBiggerSalary(int number) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() >= number) {
                System.out.println("Сотрудник c ID=" + employees[i].getId() + " " + employees[i].getFullName() + " получает " +
                        +employees[i].getSalary());
            }
        }

    }
    public void addNewEmployee(String fullName, int salary, int department){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]==null){
                employees[i] = new Employee(fullName, salary, department);
                break;
            }
        }
    }
    public void deleteEmployeeById(int id){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null&&employees[i].getId()==id){
                employees[i] = null;
            }
        }
    }
    public void deleteEmployeeByName(String fullName){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null&&employees[i].getFullName().equals(fullName)){
                employees[i] = null;
            }
        }
    }
    public void changeEmployee(String name, int salary, int d) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i]!=null&&employees[i].getFullName().equals(name)){
                employees[i].setSalary(salary);
                if (d!=0){
                employees[i].setDepartment(d);}
            }
        }
    }
    public void printListByDepartment(){
        System.out.println("Список сотрудников 1 отдела");
        getListOfEmployeesByDep(1);
        System.out.println("Список сотрудников 2 отдела");
        getListOfEmployeesByDep(2);
        System.out.println("Список сотрудников 3 отдела");
        getListOfEmployeesByDep(3);
        System.out.println("Список сотрудников 4 отдела");
        getListOfEmployeesByDep(4);
        System.out.println("Список сотрудников 5 отдела");
        getListOfEmployeesByDep(5);

    }
}
