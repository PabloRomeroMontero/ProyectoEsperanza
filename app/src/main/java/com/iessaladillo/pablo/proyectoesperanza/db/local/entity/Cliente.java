package com.iessaladillo.pablo.proyectoesperanza.db.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;

@Entity(tableName = "Cliente")
public class Cliente {

    @PrimaryKey(autoGenerate = true)
    private static long id;
    @ColumnInfo(name = "nombre")
    private String nombre;
    @ColumnInfo(name = "telefono")
    private int telefono;


    public Cliente(String nombre, int telefono) {
        this.id=0;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Cliente.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
