package com.rx.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by youjin on 2017/10/12.
 */
@Repository
public interface TestDao {

    public Map findOne(String id);
}
