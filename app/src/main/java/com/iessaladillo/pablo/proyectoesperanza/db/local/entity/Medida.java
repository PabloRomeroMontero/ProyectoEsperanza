package com.iessaladillo.pablo.proyectoesperanza.db.local.entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "Medida",
        foreignKeys = @ForeignKey(entity = Vestido.class,
        parentColumns = "id_vestido",
        childColumns = "id_vestido",
        onDelete = CASCADE,
        onUpdate = CASCADE))

public class Medida {
    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(name = "cantidad")
    private double cantidad;
    @ColumnInfo(name = "nombre")
    private double nombre;
    @ColumnInfo(name="id_vestido")
    private long id_vestido;

    public Medida( double cantidad, double nombre, long id_vestido) {
        this.id = 0;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.id_vestido = id_vestido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getNombre() {
        return nombre;
    }

    public void setNombre(double nombre) {
        this.nombre = nombre;
    }

    public long getId_vestido() {
        return id_vestido;
    }

    public void setId_vestido(long id_vestido) {
        this.id_vestido = id_vestido;
    }
}
