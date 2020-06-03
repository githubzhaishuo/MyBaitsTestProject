package com.zgyzs.dao;

import com.zgyzs.domain.T1;

import java.util.List;

public interface IT1Dao {
    List<T1> findAll();
    void saveT1(T1 t1);
}
