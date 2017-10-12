package com.rx.service.serviceImpl;

import com.rx.dao.TestDao;
import com.rx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by youjin on 2017/10/12.
 */
@Service
public class TestServiceImpl implements TestService{

    @Autowired
    TestDao dao;

    public Map findOne(String id) {
        return dao.findOne(id);
    }
}
