class Calculator {

    public void calculate(int a, int b, char op) {
        switch (op) {
            case '+':
                System.out.println("Сумма: " + (a + b));
                break;
            case '-':
                System.out.println("Разность: " + (a - b));
                break;
            case '*':
                System.out.println("Произведение: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("На 0 нельзя");
                    break;
                }
                System.out.println("Деление: " + (a / b));
                break;
            default:
                System.out.println("Неправильно выбран символ");
        }
    }

    public double calculate(double a, double b) {
        System.out.print("Результат: ");
        return a + b;
    }

    public int calculate(int... values) {
        System.out.print("Результат: ");
        int sum = 0;
        for (int s: values){
            sum += s;
        }
        return sum;
    }
}

class Student {

    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {return firstName + " " + lastName;}

    public void compare(Student other) {
        System.out.println(getFullName());
    }

    public void compare(String lastName) {
        if (lastName != firstName) {
            System.out.println("Имя: " + lastName);
        } else {
            System.out.println("Фамилия и имя одинаковы: " + lastName + " " + firstName);
        }
    }
}

public class HW1 {
    public static void main(String[] args) {
        Calculator s1 = new Calculator();
        s1.calculate(4, 2, '*');
        System.out.println(s1.calculate(5.1f, 6.2f));
        System.out.println(s1.calculate(0, 2, 3, 8));

        System.out.println();

        Student s2 = new Student("Иванов", "Артём");
        s2.compare(s2);
        s2.compare("Иванов");
        s2.compare("Пётр");
    }
}