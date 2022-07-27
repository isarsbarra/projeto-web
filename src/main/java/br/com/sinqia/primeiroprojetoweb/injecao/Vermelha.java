package br.com.sinqia.primeiroprojetoweb.injecao;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

@VermelhoQualifier
//@Named("vermelha")
//@Alternative
public class Vermelha implements Cor{
    @Override
    public String definirCor(){
        return "Vermelha";
    }
}
