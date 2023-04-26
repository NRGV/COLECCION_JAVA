/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Libro {
    private String titulo;
    private String autor;
    private int yearofpublish;

    public Libro() {
    }

    public Libro(String titulo, String autor, int yearofpublish) {
        this.titulo = titulo;
        this.autor = autor;
        this.yearofpublish = yearofpublish;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYearofpublish() {
        return yearofpublish;
    }

    public void setYearofpublish(int yearofpublish) {
        this.yearofpublish = yearofpublish;
    }
    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", yearofpublish=" + yearofpublish + '}';
    }  
    
   
}
