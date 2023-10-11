public class Main {
    public static void main(String[] args) {
        var employee = new Employee(); // Employee.java
        employee.setBaseSalary(50_000);// setBaseSalary() is a setter method
        employee.setHourlyRate(20);   // setHourlyRate() is a setter method

        int wage = employee.calculateWage(10); // calculateWage() is a method
        System.out.println(wage); // 50000 + (20 * 10) = 50200

        // employee.setBaseSalary(-1);
        // employee.setHourlyRate(-1);

        System.out.println(employee.getBaseSalary());
        System.out.println(employee.getHourlyRate());

    }
}