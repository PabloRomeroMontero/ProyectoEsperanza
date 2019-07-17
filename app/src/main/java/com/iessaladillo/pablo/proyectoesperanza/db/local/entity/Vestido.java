package com.iessaladillo.pablo.proyectoesperanza.db.local.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import java.time.LocalDate;
import java.util.ArrayList;

import static androidx.room.ForeignKey.CASCADE;


@Entity(tableName = "Vestido",
        foreignKeys = @ForeignKey(entity = Cliente.class,
                parentColumns = "id",
                childColumns = "id_cliente",
                onDelete = CASCADE,
                onUpdate = CASCADE))
public class Vestido {

    @PrimaryKey(autoGenerate = true)
    private long id_vestido;
    @ColumnInfo(name="fecha_entrega")
    private LocalDate fecha_entrega;
    @ColumnInfo(name="nombre")
    private String nombre;
    @ColumnInfo(name="foto")
    private String foto;
    @ColumnInfo(name="precio")
    private int precio;
    @ColumnInfo(name = "id_cliente")
    private long id_cliente;


    public Vestido(LocalDate fecha_entrega, String nombre, String foto, int precio, long id_cliente) {
        this.id_vestido=0;
        this.fecha_entrega = fecha_entrega;
        this.nombre = nombre;
        this.foto = foto;
        this.precio = precio;
        this.id_cliente = id_cliente;
    }


    public long getId_vestido() {
        return id_vestido;
    }

    public void setId_vestido(long id_vestido) {
        this.id_vestido = id_vestido;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }
}
