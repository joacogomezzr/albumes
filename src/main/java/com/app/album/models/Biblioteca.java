package com.app.album.models;

import com.app.album.App;

import java.util.ArrayList;

public class Biblioteca {
    private AlbumDigital caifanes = new AlbumDigital("Caifanes", "Caifanes", "AAC");
    private AlbumDigital shakira = new AlbumDigital("Las mujeres no lloran", "Shakira", "AAC");
    private AlbumDigital zoe = new AlbumDigital("MTV Unplugged", "Zoé", "mp3");
    private ArrayList<AlbumFisico> albumFisicos = new ArrayList<>();
    private ArrayList<AlbumDigital> albumDigitals = new ArrayList<>();

    public ArrayList<AlbumDigital> getAlbumDigitals() {
        return albumDigitals;
    }

    public void init(){
        caifanes.initData();
        shakira.initData();
        zoe.initData();
    }

    public AlbumDigital getCaifanes() {
        return caifanes;
    }

    public AlbumDigital getShakira() {
        return shakira;
    }

    public AlbumDigital getZoe() {
        return zoe;
    }

    public ArrayList<AlbumFisico> getAlbumFisicos() {
        return albumFisicos;
    }

    public boolean comprarAlbum(String nombre){
        boolean flag = false;
        for (int i = 0; i < albumFisicos.size(); i++) {
            if (nombre.equals(albumFisicos.get(i).getTitulo()) && albumFisicos.get(i).getStock() > 0){
                flag = true;
                albumFisicos.get(i).setStock(albumFisicos.get(i).getStock()-1);
                i = albumFisicos.size();
            }
        }
        return flag;
    }

    public void initData(){
        albumFisicos.add(new AlbumFisico("Caifanes", "Caifanes", 3, 150));
        albumFisicos.add(new AlbumFisico("las mujeres no lloran", "Shakira", 3, 160));
        albumFisicos.add(new AlbumFisico("MTV Unplugged", "Zoé", 3, 180));
        albumDigitals.add(new AlbumDigital("Caifanes", "Caifanes", "AAC"));
        albumDigitals.add(new AlbumDigital("Las mujeres no lloran", "Shakira", "AAC"));
        albumDigitals.add(new AlbumDigital("MTV Unplugged", "Zoé", "mp3"));
    }
}
