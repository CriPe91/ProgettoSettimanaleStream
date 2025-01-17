package org.example;


import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class MainArchivio {

    private static Scanner sc = new Scanner(System.in);

    private static List<Libri> ListaLibri = new ArrayList<Libri>();
    private static List<Riviste> ListaRiviste = new ArrayList<Riviste>();
    private static List<CatalogoBibliotecario> ListaCatalogo = new ArrayList<>();


    public static void main( String[] args ) {


        Logger log = LoggerFactory.getLogger(MainArchivio.class);

        CreaListaLibri();
        CreaListaRiviste();

        System.out.println("Lista Catalogo: ");
        CreaListaCatalogo();

        //Ricerca anno publicazione
        System.out.println("Inserisci anno per la ricerca: ");
        RicercaAnnoPublicazione(Integer.parseInt(sc.nextLine()));


        //Ricerca autore
        System.out.println("Inserisci autore per la ricerca: ");
        RicercaPerAutore(sc.nextLine().toLowerCase());

        //Ricerca per ISBN
        System.out.println("Inserisci codice per la ricerca: ");
        RicercaPerIsbn(Integer.parseInt(sc.nextLine()));

    }

    public static Faker fakeObj = new Faker(new Locale("it-IT"));

    public static void CreaListaLibri(){

        Libri l1 = new Libri(fakeObj.random().nextInt(1,2),fakeObj.book().title(),fakeObj.number().numberBetween(1980,1981),fakeObj.number().numberBetween(50,500),"Ubaldo",fakeObj.book().genre());
        Libri l2 = new Libri(fakeObj.random().nextInt(1,2),fakeObj.book().title(),fakeObj.number().numberBetween(1990,1991),fakeObj.number().numberBetween(50,500),"Paperino",fakeObj.book().genre());
        Libri l3 = new Libri(fakeObj.random().nextInt(1,2),fakeObj.book().title(),fakeObj.number().numberBetween(2000,2001),fakeObj.number().numberBetween(50,500),fakeObj.book().author(),fakeObj.book().genre());
        Libri l4 = new Libri(fakeObj.random().nextInt(1,2),fakeObj.book().title(),fakeObj.number().numberBetween(2010,2011),fakeObj.number().numberBetween(50,500),fakeObj.book().author(),fakeObj.book().genre());

        ListaLibri.addAll(Arrays.asList(l1,l2,l3,l4));
    };

    public static void  CreaListaRiviste(){
        Riviste r1 = new Riviste(fakeObj.random().nextInt(3,4),fakeObj.book().title(),fakeObj.number().numberBetween(1985,1986),fakeObj.number().numberBetween(20,150),Periodicita.settimanale);
        Riviste r2 = new Riviste(fakeObj.random().nextInt(3,4),fakeObj.book().title(),fakeObj.number().numberBetween(1995,1996),fakeObj.number().numberBetween(20,150),Periodicita.settimanale);
        Riviste r3 = new Riviste(fakeObj.random().nextInt(3,4),fakeObj.book().title(),fakeObj.number().numberBetween(2005,2006),fakeObj.number().numberBetween(20,150),Periodicita.settimanale);
        Riviste r4 = new Riviste(fakeObj.random().nextInt(3,4),fakeObj.book().title(),fakeObj.number().numberBetween(2024,2025),fakeObj.number().numberBetween(20,150),Periodicita.settimanale);

    ListaRiviste.addAll(Arrays.asList(r1,r2,r3,r4));
    };

    public static void CreaListaCatalogo(){
        ListaCatalogo.addAll(ListaLibri);
        ListaCatalogo.addAll(ListaRiviste);

        ListaCatalogo.forEach(System.out::println);
    }

//    //Aggiungi Elemento
//    public static Set<CatalogoBibliotecario> aggiuntaElemento(){
//        return ListaCatalogo.stream()
//
//
//    }

    // Ricerca anno publicazione
    public static void RicercaAnnoPublicazione(int anno){
        ListaCatalogo.stream()
                .filter(ListaCatalogo->ListaCatalogo.getAnnoPublicazione() == anno)
                .peek(Catalogo-> System.out.println("Prodotto trovato(per anno): " + Catalogo))
                .findFirst();
    }

    //Ricerca autore
    public static void RicercaPerAutore(String autore){
        ListaLibri.stream()
                .filter(ListaLibri->ListaLibri.getAutore().equals(autore))
                .peek(Libri-> System.out.println("Prodotto trovato(per autore): " + Libri))
                .findFirst();
    }

    //Ricerca ISBN
    public static void RicercaPerIsbn(int codice){
        ListaCatalogo.stream()
                .filter(ListaCatalogo->ListaCatalogo.getCodiceIsbn() == codice)
                .peek(Catalogo-> System.out.println("Prodotto trovato(per ISBN): " + Catalogo))
                .findFirst();
    }

    //Rimozione di un elemento dato un ISBN


}
