

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
    public static int elsoHianyzoZokni(int[] sorszamok){
    int n = sorszamok.length;
    boolean[] szerepel = new boolean[n + 1];

   // Mark only positive numbers that can affect the answer.
    for (int szam : sorszamok) {
        if (szam > 0 && szam <= n) {
            szerepel[szam] = true;
        }
    }

    // The first unmarked number is the smallest missing positive integer.
    for (int i = 1; i <= n; i++) {
        if (!szerepel[i]) {
            return i;
        }
    }

    // If all numbers from 1 to n exist, n + 1 is missing.
    return n + 1;
}
 
}
