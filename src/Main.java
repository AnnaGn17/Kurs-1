import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
public class Main {
        public static void main(String[] args) {
            Employee [] allEmployees = new Employee[10];
            allEmployees [0] = new Employee("Александров Александр Александрович",1, 30000);
            allEmployees [1] = new Employee("Борисов Борис Борисович", 1, 31000);
            allEmployees [2] = new Employee("Владимиров Владимир Владимирович", 2, 32000);
            allEmployees [3] = new Employee("Григорьев Григорий Григорьевич", 2, 32000);
            allEmployees [4] = new Employee("Дмитриев Дмитрий Дмитриевич", 3, 34000);
            allEmployees [5] = new Employee("Евгеньев Евгений Евгеньевич", 3, 32000);
            allEmployees [6] = new Employee("Жанов Жан Жанович", 4, 30000);
            allEmployees [7] = new Employee("Захаров Захар Захарович", 4, 31000);
            allEmployees [8] = new Employee("Ибрагимов Ибрагим Ибрагимович", 5, 31000);
            allEmployees [9] = new Employee("Константинов Константин Константинович", 5, 32000);
            // task 1
            for (Employee i: allEmployees) {
                System.out.println(i);
            }
            IntSummaryStatistics result = Arrays.stream(allEmployees).collect(Collectors.summarizingInt(Employee::getSalary));
            // task 2
            System.out.println("Сумма затрат на зарплату за месяц: " + result.getSum());
            // task 3
            System.out.println("Минимальная зарплата: " + result.getMin());
            // task 4
            System.out.println("Максимальная зарплата: " + result.getMax());
            // task 5
            System.out.println("В среднем зарплата: " + result.getAverage());



    }


}