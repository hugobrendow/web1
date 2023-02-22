package br.com.ada.pizzaria.model;

public class Produto {
    private String nome;
    private String urlImagem;
    private String preco;

    public Produto(String nome, String urlImagem, String preco) {
        this.nome = nome;
        this.urlImagem = urlImagem;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
