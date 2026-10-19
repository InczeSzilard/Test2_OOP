
package com.mycompany.test2;

class TeleportalosUrZokni extends UrZokni {
private String galaxis;
public TeleportalosUrZokni(String azonosito,int tisztasagPont,String galaxis) {
super(azonosito, tisztasagPont);
this.galaxis = galaxis;
}



@Override
public String cimke() {
return "Teleport zokni: " + getAzonosito() + "," + getTisztasagPont()+ "," + galaxis;
//To return all the elements we need to add it. Get will help return the value of an atribute that is private
}
}
