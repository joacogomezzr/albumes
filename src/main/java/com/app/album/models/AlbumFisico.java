package com.app.album.models;

import java.util.ArrayList;

public class AlbumFisico extends Album{
    private int stock;
    private int precio;
    private ArrayList<Cancion> albumMichaeljackson = new ArrayList<>();
    private ArrayList<Cancion> albumZoe = new ArrayList<>();
    private ArrayList<Cancion> albumCaifanes = new ArrayList<>();

    public ArrayList<Cancion> getAlbumShakira() {
        return albumMichaeljackson;
    }

    public ArrayList<Cancion> getAlbumZoe() {
        return albumZoe;
    }

    public ArrayList<Cancion> getAlbumCaifanes() {
        return albumCaifanes;
    }

    public AlbumFisico(String titulo, String artista, int stock, int precio) {
        super(titulo, artista);
        this.stock = stock;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
//    public void initData(){
//        albumMichaeljackson.add(new Cancion("Baby Be Mine", "Michaeljackson"));
//        albumMichaeljackson.add(new Cancion("Beat It", "Michaeljackson"));
//        albumMichaeljackson.add(new Cancion("Pretty Young Thing", "Michaeljackson"));
//        albumZoe.add(new Cancion("Luna", "Zoé"));
//        albumZoe.add(new Cancion("Labios Rotos", "Zoé"));
//        albumZoe.add(new Cancion("Paula", "Zoé"));
//        albumCaifanes.add(new Cancion("Afuera", "Caifanes"));
//        albumCaifanes.add(new Cancion("La Célula que explota", "Caifanes"));
//        albumCaifanes.add(new Cancion("Viento", "Caifanes"));
//    }

    @Override
    public String toString() {
        return "AlbumFisico{" +
                "stock=" + stock +
                ", precio=" + precio +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                '}';
    }
}
