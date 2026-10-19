
package com.mycompany.test2;

class UrZokni {
private String azonosito;
private int tisztasagPont;
public UrZokni(String azonosito, int tisztasagPont) {
    //It won't let azonosito to be null or empty.
    if(azonosito==null|| azonosito.isEmpty()){
    throw new IllegalArgumentException("Az azonosito nem lehet ures vagy null!");
    }
    //It won't let tisztasagPont to be negativ
    if(tisztasagPont<0){
        throw new IllegalArgumentException("A tisztasagPont nem lehet negeativ!");
    }
this.azonosito = azonosito;// this. refers to the object so the constructor can initialize that object
this.tisztasagPont = tisztasagPont;
}
public void mosas(int pluszPont) {
tisztasagPont += pluszPont;
}
public int getTisztasagPont() {
return tisztasagPont;
}
public String getAzonosito(){
    return azonosito;//It returns the value of a String
}

public String cimke() {
return azonosito + ": " + tisztasagPont;
}
}