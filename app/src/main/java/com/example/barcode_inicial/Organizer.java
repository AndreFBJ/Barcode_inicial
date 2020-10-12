/*package com.example.barcode_inicial;

import android.app.AppComponentFactory;
import android.util.Log;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Organizer<InfoTarjeta> extends MainActivity{

    private static final String TAG = ;

    private InfoTarjeta parseDataCode(Barcode barcode){
        InfoTarjeta infoTarjeta = null;
        if (barcode != null) {

            String barCode=barcode.displayValue;
            //Log.d(TAG, "Barcode length: " + barcode.displayValue.length());
            if(barcode.displayValue.length()<150) {
                //TODO lanzar excepcion y mensaje
                return infoTarjeta;}

            infoTarjeta= new InfoTarjeta();
            String primerApellido="", segundoApellido="", primerNombre="", segundoNombre="",cedula="",rh="" ,fechaNacimiento="",sexo="";

            String alphaAndDigits = barCode.replaceAll("[^\\p{Alpha}\\p{Digit}\\+\\_]+", " ");
            String[] splitStr = alphaAndDigits.split("\\s+");
            /*
            for (int i=0; i<splitStr.length;i++){
                Log.d(TAG, i + "valor: " + splitStr[i]);
            }

            if(!alphaAndDigits.contains("PubDSK"))
            {
                int corrimiento=0;


                Pattern pat = Pattern.compile("[A-Z]");
                Matcher match = pat.matcher(splitStr[2+corrimiento]);
                int lastCapitalIndex = -1;
                if(match.find())
                {
                    lastCapitalIndex = match.start();
                    Log.d(TAG, "match.start: " + match.start());
                    Log.d(TAG, "match.end: " + match.end());
                    Log.d(TAG, "splitStr: " + splitStr[2+corrimiento]);
                    Log.d(TAG, "splitStr length: " + splitStr[2+corrimiento].length());
                    Log.d(TAG, "lastCapitalIndex: " + lastCapitalIndex);
                }
                cedula=splitStr[2+corrimiento].substring(lastCapitalIndex-10,lastCapitalIndex);
                primerApellido=splitStr[2+corrimiento].substring(lastCapitalIndex);
                segundoApellido=splitStr[3+corrimiento];
                primerNombre=splitStr[4+corrimiento];
                /**
                 * Se verifica que contenga segundo nombre

                if (Character.isDigit(splitStr[5+corrimiento].charAt(0))){
                    corrimiento--;
                }
                else{
                    segundoNombre=splitStr[5+corrimiento];
                }

                sexo= splitStr[6+corrimiento].contains("M") ? "Masculino":"Femenino";
                rh= splitStr[6+corrimiento].substring(splitStr[6+corrimiento].length() - 2);
                fechaNacimiento=splitStr[6+corrimiento].substring(2, 10);

            }
            else{
                int corrimiento=0;
                Pattern pat = Pattern.compile("[A-Z]");
                if (splitStr[2+corrimiento].length()>7){
                    corrimiento--;
                }


                Matcher match = pat.matcher(splitStr[3+corrimiento]);
                int lastCapitalIndex = -1;
                if(match.find())
                {
                    lastCapitalIndex = match.start();

                }

                cedula=splitStr[3+corrimiento].substring(lastCapitalIndex-10, lastCapitalIndex);
                primerApellido=splitStr[3+corrimiento].substring(lastCapitalIndex);
                segundoApellido=splitStr[4+corrimiento];
                primerNombre=splitStr[5+corrimiento];
                segundoNombre=splitStr[6+corrimiento];
                sexo= splitStr[7+corrimiento].contains("M") ? "Masculino":"Femenino";
                rh= splitStr[7+corrimiento].substring(splitStr[7+corrimiento].length() - 2);
                fechaNacimiento=splitStr[7+corrimiento].substring(2, 10);

            }
            /**
             * Se setea el objeto con los datos

            infoTarjeta.setPrimerNombre(primerNombre);
            infoTarjeta.setSegundoNombre(segundoNombre);
            infoTarjeta.setPrimerApellido(primerApellido);
            infoTarjeta.setSegundoApellido(segundoApellido);
            infoTarjeta.setCedula(cedula);
            infoTarjeta.setSexo(sexo);
            infoTarjeta.setFechaNacimiento(fechaNacimiento);
            infoTarjeta.setRh(rh);


        } else {
            Log.d(TAG, "No barcode capturado");
            return infoTarjeta;
        }

        return infoTarjeta;
    }

}*/