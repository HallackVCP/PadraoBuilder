package org.example;

import java.util.Date;

public class MotoristaBuilder {

    private Motorista motorista;

    public MotoristaBuilder() {
        motorista = new Motorista();
    }

    public Motorista build() {
        if (motorista.getCnh().equals("")) {
            throw new IllegalArgumentException("CNH inválida");
        }
        if (motorista.getCpf().equals("")) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if (motorista.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return motorista;
    }

    public MotoristaBuilder setNome(String nome) {
        this.motorista.setNome(nome);
        return this;
    }

    public MotoristaBuilder setCpf(String cpf) {
        this.motorista.setCpf(cpf);
        return this;
    }

    public MotoristaBuilder setCnh(String cnh) {
        this.motorista.setCnh(cnh);
        return this;
    }

    public MotoristaBuilder setDataNascimento(Date dataNascimento) {
        this.motorista.setDataNascimento(dataNascimento);
        return this;
    }

    public MotoristaBuilder setNomeMae(String nomeMae) {
        this.motorista.setNomeMae(nomeMae);
        return this;
    }

    public MotoristaBuilder setNomePai(String nomePai) {
        this.motorista.setNomePai(nomePai);
        return this;
    }

    public MotoristaBuilder setRg(String rg) {
        this.motorista.setRg(rg);
        return this;
    }

    public MotoristaBuilder setEmail(String email) {
        this.motorista.setEmail(email);
        return this;
    }

    public MotoristaBuilder setCelular(String celular) {
        this.motorista.setCelular(celular);
        return this;
    }
}
