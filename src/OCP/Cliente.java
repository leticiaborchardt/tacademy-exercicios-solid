package OCP;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String nome;
    private LocalDate dataNascimento;
    private boolean isEstudante;
    private Desconto desconto;

    public Cliente(String nome, LocalDate dataNascimento, boolean isEstudante) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.isEstudante = isEstudante;
        this.desconto = this.obterDesconto();
    }

    private Desconto obterDesconto() {
        if (this.isIdoso()) {
            return new DescontoIdoso();
        } else if (this.isEstudante()) {
            return new DescontoEstudante();
        }

        return null;
    }

    private boolean isIdoso() {
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(this.getDataNascimento(), hoje);

        return idade.getYears() >= 60;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isEstudante() {
        return isEstudante;
    }

    public void setEstudante(boolean estudante) {
        isEstudante = estudante;
    }

    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }
}
