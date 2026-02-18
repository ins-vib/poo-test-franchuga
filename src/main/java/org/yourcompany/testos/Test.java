package org.yourcompany.testos;

import java.util.ArrayList;

public class Test {
    private ArrayList preguntes = new ArrayList<Pregunta>();
    private int[] resposta_usu;
    private int numPregunta = 0;

    public Test(ArrayList<Pregunta> preguntes){

    }

    

    public String getEnunciatPreguntaActual(){
        return preguntes.get(numPregunta);
    }

    public ArrayList getPreguntes() {
        return preguntes;
    }

    public void setPreguntes(ArrayList preguntes) {
        this.preguntes = preguntes;
    }

    public int[] getResposta_usu() {
        return resposta_usu;
    }

    public void setResposta_usu(int[] resposta_usu) {
        this.resposta_usu = resposta_usu;
    }

    public int getNumPregunta() {
        return numPregunta;
    }

    public void setNumPregunta(int numPregunta) {
        this.numPregunta = numPregunta;
    }

    

}
