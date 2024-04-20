package com.app.album.models;

import java.util.ArrayList;

public class AlbumDigital extends Album{
    private String formato;
    private ArrayList<Cancion> albumShakira = new ArrayList<>();
    private ArrayList<Cancion> albumZoe = new ArrayList<>();
    private ArrayList<Cancion> albumCaifanes = new ArrayList<>();

    public AlbumDigital(String titulo, String artista, String formato) {
        super(titulo, artista);
        this.formato = formato;
    }

    public ArrayList<Cancion> getAlbumShakira() {
        return albumShakira;
    }

    public ArrayList<Cancion> getAlbumZoe() {
        return albumZoe;
    }

    public ArrayList<Cancion> getAlbumCaifanes() {
        return albumCaifanes;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void initData(){
        albumShakira.add(new Cancion("Hips Don't Lie", "Shakira"));
        albumShakira.add(new Cancion("Me Enamoré", "Shakira"));
        albumShakira.add(new Cancion("Waka Waka (This Time for Africa)", "Shakira"));
        albumZoe.add(new Cancion("Luna", "Zoé"));
        albumZoe.add(new Cancion("Labios Rotos", "Zoé"));
        albumZoe.add(new Cancion("Paula", "Zoé"));
        albumCaifanes.add(new Cancion("Afuera", "Caifanes"));
        albumCaifanes.add(new Cancion("La Célula que explota", "Caifanes"));
        albumCaifanes.add(new Cancion("Viento", "Caifanes"));
    }

    @Override
    public String toString() {
        return "AlbumDigital{" +
                "formato='" + formato + '\'' +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
