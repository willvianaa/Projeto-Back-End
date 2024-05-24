package br.com.crud.projeto.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private long userID;

    @Column(name = "nome")
    @Getter @Setter private String nome;

    @Column(name = "senha")
    @Getter @Setter private String senha;

    @Column(name = "cpf")
    @Getter @Setter private String cpf;

    @Column(name = "dataNascimento")
    @Getter @Setter private String dataNascimento;
}
