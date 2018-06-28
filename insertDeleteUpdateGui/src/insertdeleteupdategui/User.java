/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertdeleteupdategui;

/**
 *
 * @author HP
 */
class User {
    private int id,age;
    private String name,phone,email,address;
    public User (int id, String name,int age, String phone,String email, String address){
        this.id=id;
        this.name=name;
        this.age=age;
        this.phone=phone;
        this.email=email;
        this.address=address;
    }
    public int getid(){
        return id;  
    }
    public String getname(){
        return name;  
    }
    public int getage(){
        return age;
    }
    public String getphone(){
        return phone;
    }
        public String getemail(){
            return email;
        }
        public String getaddress(){
            return address;
        }
}
