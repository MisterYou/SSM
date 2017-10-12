package com.rx.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by youjin on 2017/10/12.
 */
@Repository
public interface TestDao {

     Map findOne(String id);
}
