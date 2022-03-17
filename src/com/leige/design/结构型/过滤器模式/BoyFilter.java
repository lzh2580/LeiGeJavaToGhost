package com.leige.design.结构型.过滤器模式;

import java.util.List;
import java.util.stream.Collectors;

/**
 * BoyFilter
 */
public class BoyFilter implements IFilter{
    @Override
    public List<Person> filter(List<Person> persons) {
        return persons.stream().filter(person -> person.getSex().equals("男")).collect(Collectors.toList());
    }
}
