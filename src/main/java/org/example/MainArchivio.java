package org.example;


import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class MainArchivio {

    private static List<Libri> ListaLibri = new ArrayList<Libri>();
    private static List<Riviste> ListaRiviste = new ArrayList<Riviste>();



    public static void main( String[] args ) {
        Logger log = LoggerFactory.getLogger(MainArchivio.class);








    }

    public static Faker fakeObj = new Faker(new Locale("it-IT"));

    public static void CreaListaLibri(){

        Libri l1 = new Libri(fakeObj.random().nextInt(100,1000),fakeObj.book().title(),fakeObj.number().numberBetween(1980,2025),fakeObj.number().numberBetween(50,500),fakeObj.book().author(),fakeObj.book().genre());
        Libri l2 = new Libri(fakeObj.random().nextInt(100,1000),fakeObj.book().title(),fakeObj.number().numberBetween(1980,2025),fakeObj.number().numberBetween(50,500),fakeObj.book().author(),fakeObj.book().genre());
        Libri l3 = new Libri(fakeObj.random().nextInt(100,1000),fakeObj.book().title(),fakeObj.number().numberBetween(1980,2025),fakeObj.number().numberBetween(50,500),fakeObj.book().author(),fakeObj.book().genre());
        Libri l4 = new Libri(fakeObj.random().nextInt(100,1000),fakeObj.book().title(),fakeObj.number().numberBetween(1980,2025),fakeObj.number().numberBetween(50,500),fakeObj.book().author(),fakeObj.book().genre());

        ListaLibri.addAll(Arrays.asList(l1,l2,l3,l4));
    };

    public static void  CreaListaRiviste(){
        Riviste r1 = new Riviste(fakeObj.random().nextInt(100,1000),fakeObj.book().title(),fakeObj.number().numberBetween(2000,2025),fakeObj.number().numberBetween(20,150),Periodicita.settimanale);
        Riviste r2 = new Riviste(fakeObj.random().nextInt(100,1000),fakeObj.book().title(),fakeObj.number().numberBetween(2000,2025),fakeObj.number().numberBetween(20,150),Periodicita.settimanale);
        Riviste r3 = new Riviste(fakeObj.random().nextInt(100,1000),fakeObj.book().title(),fakeObj.number().numberBetween(2000,2025),fakeObj.number().numberBetween(20,150),Periodicita.settimanale);
        Riviste r4 = new Riviste(fakeObj.random().nextInt(100,1000),fakeObj.book().title(),fakeObj.number().numberBetween(2000,2025),fakeObj.number().numberBetween(20,150),Periodicita.settimanale);

    ListaRiviste.addAll(Arrays.asList(r1,r2,r3,r4));
    };

}
