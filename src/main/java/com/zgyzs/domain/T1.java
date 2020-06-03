package com.zgyzs.domain;

import java.io.Serializable;

public class T1 implements Serializable {
    private Integer id;
    private String k;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "T1{" +
                "id=" + id +
                ", k='" + k + '\'' +
                '}';
    }

}
