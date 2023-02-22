package br.com.ada.pizzaria.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TraducaoService {

    public String getMensagem(String language) {
        String result = "";
        switch (language) {
            case "fr" : result = "Bonjour"; break;
            case "de" : result = "Willkommen"; break;
            case "en" : result = "Good Morning"; break;
        }
        return result;
    }
}