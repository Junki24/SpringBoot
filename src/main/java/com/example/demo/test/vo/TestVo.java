package com.example.demo.test.vo;

public class TestVo {

    private Long mbrNo;
    private String id;
    private String name;

    public Long getMbrNo() {
        return mbrNo;
    }

    public void setMbrNo(Long mbrNo) {
        this.mbrNo = mbrNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestVo(String id, String name){
        this.id = id;
        this.name = name;
    }
}
