package com.example.demo.test.vo;

public class MemberDTO {
    private String _id; //mongodb의 document (레코드에 해당) 식별자
    private String passwd;
    private String name;
    private String email;
    private String hp;
    private String zipcode;
    private String address1;
    private String address2;

    //생성자, getter, setter, tostring()
    public MemberDTO(){
    }

    public String get_id(){
        return _id;
    }
    public void set_id(String _id){
        this._id = _id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Override
    public String toString() {
        return "MemberDTO [_id=" + _id + ", passwd=" + passwd + ", name=" + name + ", email=" + email + ", hp=" + hp
                + ", zipcode=" + zipcode + ", address1=" + address1 + ", address2=" + address2 + "]";
    }
}
