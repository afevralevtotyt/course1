public class Employee {
    private String fullName;
    private int salary;
    private int department;
    private static int counter = 1;
    private int id;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = counter;
        counter++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }


    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Жалование не может быть меньше, либо равно нулю");
        }
    }

    public void setDepartment(int department) {
        if (department <= 5 && department >= 1) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("Неверный номер отдела. Всего 5 отделов, 1-5");
        }

    }

    @Override
    public String toString() {
        return "Сотрудник "
                + fullName +
                " получает жалование " + salary +
                " в отделе " + department +
                ". Порядковый номер сотрудника в базе " + id;
    }
    public String toStringByDep() {
        return "Сотрудник "
                + fullName +
                " получает жалование " + salary +
                ". Порядковый номер сотрудника в базе " + id;
    }
}
