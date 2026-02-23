package org.yourcompany.testos;

import java.util.ArrayList;

public class Test {
    private ArrayList<Pregunta> preguntes = new ArrayList<>();
    private int[] resposta_usu;
    private int numPregunta = 0;

    public Test(ArrayList<Pregunta> preguntes){

    }

    public String getEnunciatPreguntaActual(){
        String enunciat = preguntes.get(numPregunta).getEnunciat();
        return enunciat;
    }

    public String[] getRespostesPreguntaActual(){
        String[] respostes = preguntes.get(numPregunta).getRespostes();
        return respostes;
    }

    public int getNumeroPregunta(){
        return numPregunta;
    }

    public void respondre(int resposta){
        resposta_usu[numPregunta] = resposta - 1;
    }

    public boolean anarEndevant(){
        if(numPregunta == preguntes.size() - 1){
            return false;
        }
        numPregunta++;
        return true;
    }

    public boolean anarEndarrera(){
        if(numPregunta == 0){
            return false;
        }
        numPregunta--;
        return true;
    }

    public double solucionarTest(){
        int respostesCorrectes = 0;
        for(int i = 0; i < preguntes.size(); i++){
            Pregunta preguntacomparar = preguntes.get(i);
            if(preguntacomparar.getCorrecta() == resposta_usu[i]){
                respostesCorrectes++;
            }
        }
        double valorPregunta = 10 / preguntes.size();
        return valorPregunta * respostesCorrectes;
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
