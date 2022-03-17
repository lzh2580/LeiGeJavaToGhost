package com.leige.design.结构型.过滤器模式;

import java.util.List;

/**
 * IFilter
 */
public interface IFilter {
    public List<Person> filter(List<Person> persons);
}
