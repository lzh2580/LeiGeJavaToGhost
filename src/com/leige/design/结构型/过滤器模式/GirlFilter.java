package com.leige.design.结构型.过滤器模式;

import java.util.List;
import java.util.stream.Collectors;

/**
 * GirlFilter
 */
public class GirlFilter implements IFilter{
    @Override
    public List<Person> filter(List<Person> persons) {
        return persons.stream().filter(person -> person.getSex().equals("女")).collect(Collectors.toList());
    }
}
