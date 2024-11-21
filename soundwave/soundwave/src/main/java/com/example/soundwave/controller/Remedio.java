package com.example.soundwave.controller;

import jakarta.persistence.*;
import lombok.*;
import org.apache.tomcat.util.bcel.Const;

@Entity(name="remedio")
@Table(name="Remedios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Remedio {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private  String via;
    private String lote;
    @Enumerated(EnumType.STRING)
    private Laboratorio laboratorio;


    public Remedio(cadastropessoas dados) {
            this.nome=dados.nome();
            this.via=dados.via();
            this.lote=dados.lote();
            this.laboratorio=dados.laboratorio();
    }
}
