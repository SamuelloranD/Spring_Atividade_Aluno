package alunoonline.alunoonline.dtos;

import alunoonline.alunoonline.enums.MatriculaAlunoStatusEnum;
import lombok.Data;

@Data
public class DisciplinasAlunoResponseDTO {
    private String nomeDisciplina;
    private String nomeProfessor;
    private Double nota1;
    private Double nota2;
    private Double media;
    private MatriculaAlunoStatusEnum matriculaAlunoStatusEnum;

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public MatriculaAlunoStatusEnum getMatriculaAlunoStatusEnum() {
        return matriculaAlunoStatusEnum;
    }

    public void setMatriculaAlunoStatusEnum(MatriculaAlunoStatusEnum matriculaAlunoStatusEnum) {
        this.matriculaAlunoStatusEnum = matriculaAlunoStatusEnum;
    }

    public void setStatus(MatriculaAlunoStatusEnum status) {
    }
}
