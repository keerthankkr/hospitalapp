package com.example.keerthan.hospitalapp.Model;

public class Hospital {
    public int id;
    public long phn_num;
    public String hosp_name,addres,doc_name,doc_qualification;

    public Hospital(int id,String hosp_name,String address,long phn_num,String doc_name,String doc_qualification){
        this.id=id;
        this.hosp_name=hosp_name;
        this.addres=address;
        this.phn_num=phn_num;
        this.doc_name=doc_name;
        this.doc_qualification=doc_qualification;
    }
    public Hospital(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPhn_num() {
        return phn_num;
    }

    public void setPhn_num(long phn_num) {
        this.phn_num = phn_num;
    }

    public String getHosp_name() {
        return hosp_name;
    }

    public void setHosp_name(String hosp_name) {
        this.hosp_name = hosp_name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getDoc_qualification() {
        return doc_qualification;
    }

    public void setDoc_qualification(String doc_qualification) {
        this.doc_qualification = doc_qualification;
    }
}
