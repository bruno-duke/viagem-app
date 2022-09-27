package org.brunofsleite.cliente;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Cliente extends PanacheEntity {
    
    // deixar como public facilita para o panache
    public String nome;
}
