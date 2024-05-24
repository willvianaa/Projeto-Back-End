package br.com.crud.projeto.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userID;

    @Column(name = "nome")
    private String nome;

    @Column(name = "senha")
    private String senha;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "dataDeNascimento")
    private String dataDeNascimento;
}
