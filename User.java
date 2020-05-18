/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ackyras-Laptop
 */
class User {
    String np, nama, jk, nh,nk,lengkap, validasi,tl,ttl;
    public User(String a, String b, String c, String d,String e,String f,String g, String h,String i){
        this.nama=b;
        this.lengkap=h;
        this.validasi=i;
        this.np=a;
        this.jk=c;
        this.nk=d;
        this.nh=e;
        this.tl=f;
        this.ttl=g;
        
    }
    public String getname(){
        return nama;
    }
    public String getlengkap(){
        if("0".equals(lengkap)){
            lengkap="Belum Lengkap";
        }else{
            lengkap="lengkap";
        }
        return lengkap;
    }
    public String getnvalid(){
        if("0".equals(validasi)){
            validasi="Belum divalidisasi";
        }else{
            validasi="Tervalidasi";
        }
        return validasi;
    }
    public String getnp(){
        return np;
    }
    public String getjk(){
        return jk;
    }
    public String getnh(){
        return nh;
    }
    public String getnk(){
        return nk;
    }
    public String gettl(){
        return tl;
    }
    public String getttl(){
        return ttl;
    }
}
