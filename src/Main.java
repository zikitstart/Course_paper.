public class Main {
    private static final Employee[] staff = new Employee[20];
    public static void main(String[] args) {

        staff[0] = new Employee("Смирнова Ульяна Михайловна", 1, 25500f);
        staff[1] = new Employee("Максимова Милана Михайловна", 1, 27500f);
        staff[2] = new Employee("Михайлов Александр Тимурович", 2, 30500f);
        staff[3] = new Employee("Антонов Фёдор Владимирович", 2, 29500f);
        staff[4] = new Employee("Лавров Дмитрий Иванович", 3, 43000f);
        staff[5] = new Employee("Иванов Даниил Артёмович", 3, 41700f);
        staff[6] = new Employee("Журавлев Вячеслав Даниилович", 4, 37500f);
        staff[7] = new Employee("Сомов Демид Фёдорович", 4, 35000f);
        staff[8] = new Employee("Матвеев Руслан Маратович", 5, 46500f);
        staff[9] = new Employee("Фролов Руслан Егорович", 5, 39500f);

        allStaff();
        System.out.println("Сумма затрат на зарплаты в месяц: " + allSalary() + "руб.");
        System.out.println("Сотрудник с минимальной зарплатой: "+ minSalary());
        System.out.println("Сотрудник с максимальной зарплатой: "+ maxSalary());
        System.out.println("Среднее значение зарплат в месяц: " + averageSalaries() + "руб.");
        allName();

    }
    public static void allStaff() {
        for (Employee staff : staff){
            if (staff != null) {
                System.out.println(staff);
            }
        }
    }
    public static float allSalary() {
        float sum = 0;
        for (Employee staff : staff) {
            if (staff != null) {
                sum += staff.getSalary();
            }
        }
        return sum;
    }
    public static Employee minSalary() {
        float minPayment = Integer.MAX_VALUE;
        Employee staffMinPayment = null;
        for (Employee staff : staff) {
            if (staff != null && staff.getSalary() < minPayment) {
                minPayment = staff.getSalary();
                staffMinPayment = staff;
            }
        }
        return staffMinPayment;
    }
    public static Employee maxSalary() {
        float maxPayment = Integer.MIN_VALUE;
        Employee staffMaxPayment = null;
        for (Employee staff : staff) {
            if (staff != null && staff.getSalary() > maxPayment) {
                maxPayment = staff.getSalary();
                staffMaxPayment = staff;
            }
        }
        return staffMaxPayment;
    }
    public static float averageSalaries() {
        return allSalary() / 2;
    }
    public static void allName() {
        for (Employee staff : staff) {
            if (staff != null){
                System.out.println(staff.getName());
            }
        }
    }
}