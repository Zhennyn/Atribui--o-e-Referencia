package com.projeto.atribuicaoereferencia;

public class Main {
    public static void main(String[] args) {

        int intA = 1;
        int intB = intA;

        //REGRA S106?

        //Quando o é o tipo primitivo ele copia exatamente oq esta na memoria
        System.out.println("intA= " + intA + " intB= " + intB);

        intA = 2;

        System.out.println("intA= " + intA + " intB= " + intB);

        //Aqui já é a referencia de memória
        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA;

        System.out.println("objA= " + objA + " objB= " + objB);
        
        objA.setNum(2);

        System.out.println("objA= " + objA + " objB= " + objB);
    }
}