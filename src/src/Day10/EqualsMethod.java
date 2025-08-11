package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee1 {
    int id;
    String name;

    Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals to compare object content
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // same reference
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee1 other = (Employee1) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    // Override hashCode (important when using HashSet or HashMap)
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class EqualsMethod {
    public static void main(String[] args) {
        List<Employee1> employees = new ArrayList<>();

        employees.add(new Employee1(103, "Ravi"));
        employees.add(new Employee1(101, "Amit"));
        employees.add(new Employee1(102, "Zara"));
        employees.add(new Employee1(102, "Zara")); // Duplicate object content
        employees.add(new Employee1(104, "John"));

        for (Employee1 e : employees) {
            System.out.println(e);
        }
    }
}
