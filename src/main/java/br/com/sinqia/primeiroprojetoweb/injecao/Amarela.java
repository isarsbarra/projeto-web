package br.com.sinqia.primeiroprojetoweb.injecao;

import javax.inject.Named;

@AmareloQualifier
//@Named("amarela")
public class Amarela implements Cor{
    @Override
    public String definirCor(){
        return "Amarela";
    }
}
