package com.company.classes;

import com.company.enums.Positions;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
                new Person("Mark Zuckerberg", Positions.CHIEF_TECHNOLOGY_OFFICER, 36, new BigDecimal("200000000000000000000000"), Arrays.asList(995555222, 995444555)),
                new Person("Bill Gates", Positions.IT_DIRECTOR, 55, new BigDecimal("55555"), Arrays.asList(995666555, 995555000)),
                new Person("Steve Jobs", Positions.JAVA_DEVELOPER, 58, new BigDecimal("66666"), Arrays.asList(990700800, 500900500)),
                new Person("Elon Musk", Positions.SERVICES_DEVELOPER, 40, new BigDecimal("10000"), Arrays.asList(555999555, 500555000)),
                new Person("Larry Page", Positions.PROJECT_MANAGER, 35, new BigDecimal("99999"), Arrays.asList(555999333, 990000888)),
                new Person("Dustin Moskovitz", Positions.SYSTEM_ADMINISTRATOR, 34, new BigDecimal("88888"), Arrays.asList(700800600, 500888222)),
                new Person("Priscilla Chan", Positions.JUNIOR_SOFTWARE_ENGINEER, 32, new BigDecimal("300000"), Arrays.asList(500777888, 995222666)));
        System.out.println("----------------------All information about employees (used Array.asList() method)");
        personList.forEach(System.out::println);
        System.out.println("\n----------------------Employees in IT company (used map() method)");
        List<String> personName = personList
                .stream()
                .map(person -> person.getName()
                        .toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        System.out.println(personName);
        System.out.println("\n-----------------------Phone number of employees (used flatMap() method)");
        List<Integer> personNumber = personList
                .stream().flatMap(person -> person.getPhoneNumber()
                        .stream())
                .collect(Collectors.toList());
        System.out.println(personNumber);
        BigDecimal bonus = new BigDecimal("5000000000000000000000");
        List<Person> salaryBonus = personList = personList.stream().peek(person -> {
            person.setSalary(person.getSalary().add(bonus));
        }).collect(Collectors.toList());
        System.out.println("\n------------------------After adding bonus (used Big Decimal)");
        salaryBonus.forEach(System.out::println);
        List<Person> salaryNegative = personList.stream().peek(person -> {
            person.setSalary(person.getSalary().negate());
        }).collect(Collectors.toList());
        System.out.println("\n------------------------Negative value (used negate() method)");
        salaryNegative.forEach(System.out::println);
        System.out.println("\n------------------------Getting age and position (used filter() method)");
        List<Person> ageAndPosition = personList
                .stream()
                .filter(person -> person.getAge() > 35 && person.getPosition() == Positions.JAVA_DEVELOPER ||
                        person.getAge() < 35 && person.getPosition() == Positions.SYSTEM_ADMINISTRATOR)
                .collect(Collectors.toList());
        ageAndPosition.forEach(System.out::println);
    }
}
