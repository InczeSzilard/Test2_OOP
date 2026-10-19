
package com.mycompany.test2;

class TeleportalosUrZokni extends UrZokni {
private String galaxis;
public TeleportalosUrZokni(String azonosito,int tisztasagPont,String galaxis) {
super(azonosito, tisztasagPont);
this.galaxis = galaxis;
}



@Override
public String cimke() {
return "Teleport zokni: " + getAzonosito();
}
}
