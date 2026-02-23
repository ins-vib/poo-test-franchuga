/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.testos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Bigpi
 */
public class Testos {

public static void main(String[] args) {
        // Crear l'ArrayList de preguntes
        ArrayList<Pregunta> preguntes = inicialitzarPreguntes();
        
        // Crear el test passant l'ArrayList
        Test test = new Test(preguntes);
        Scanner teclat = new Scanner(System.in);

        // 
        // Mentre l'usuari no tria Finalitzar , es pot anar endavant, endarrera, respondre
        // Quan finalitza el test es mostra la seva puntució

        boolean sortir = false;
        while(!sortir){
                System.out.println("Pregunta num: "+test.getNumPregunta());
                        System.out.println(test.getEnunciatPreguntaActual());
                        test.getRespostesPreguntaActual();
                String[] opciones = test.getRespostesPreguntaActual();
                for(int i = 0; i < opciones.length; i++){
                        System.out.println(" " + (i + 1) + ". " + opciones[i]);
                }
                System.out.println("Que vols fer?");
                System.out.println("1.Anar endarrera");
                System.out.println("2.Anar endevant");
                System.out.println("3.Respondre");
                System.out.println("4.Sortir");
                int opcio = teclat.nextInt();
                switch(opcio){
                        case 1: 
                                test.anarEndarrera();
                                break;
                        case 2:
                                test.anarEndevant();
                                break;
                        case 3: 
                                
                                System.out.println("Digues la resposta que creus");
                                int resp = teclat.nextInt();
                                test.respondre(resp);
                                break;
                        case 4:
                                sortir = true;
                                break;
                }
        }
        System.out.println("La teva puntuació total ha sigut de: " + test.solucionarTest());
        
        }

        public static ArrayList<Pregunta> inicialitzarPreguntes() {
        ArrayList<Pregunta> preguntes = new ArrayList<>();
        
        preguntes.add(new Pregunta("Qui va pintar el Guernica",
                new String[]{"Velàzquez", "Goya", "Picasso"}, 2));
        preguntes.add(new Pregunta("Qui va escriure Alicia al país de les meravelles",
                new String[]{"Grimm", "Stevenson", "Carrol"}, 2));
        preguntes.add(new Pregunta("Quina és la magnitud que relaciona espai i temps",
                new String[]{"velocitat", "temperatura", "pes"}, 0));
        preguntes.add(new Pregunta("Si el radi d'una circumferència és 4, el seu diàmetre és",
                new String[]{"4", "8", "12", "14"}, 1));
        preguntes.add(new Pregunta("Quants segons té 1 hora",
                new String[]{"420", "760", "3600"}, 2));
        preguntes.add(new Pregunta("Quin no és un llenguatge de programació",
                new String[]{"java", "php", "samsung"}, 2));
        preguntes.add(new Pregunta("Dins un termòmetre hi trobem",
                new String[]{"aigua", "aigua amb gas", "mercuri"}, 2));
        preguntes.add(new Pregunta("L'Acropolis es troba a",
                new String[]{"Atenes", "Roma", "París"}, 0));
        preguntes.add(new Pregunta("L'element químic amb símbol Fe és ",
                new String[]{"Estronci", "Ferro", "Feril·li"}, 1));
        preguntes.add(new Pregunta("La capital d'Estats Units és",
                new String[]{"Georgetown", "New York", "Washington"}, 2));
        
        return preguntes;
        }

    // Altres mètodes que consideris necessaris...
}

