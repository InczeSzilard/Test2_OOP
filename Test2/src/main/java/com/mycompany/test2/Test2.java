

package com.mycompany.test2;


public class Test2 {

    public static void main(String[] args) {
        
        UrZokni x=new UrZokni("ZOKNI-45",6);//The main version
        
UrZokni z = new TeleportalosUrZokni(
"ZOKNI-42", 4, "Andromeda");//The Override version
z.mosas(6);

System.out.println(z.cimke());
System.out.println(x.cimke());
}
}
