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

    public void setStatus(MatriculaAlunoStatusEnum status) {
        this.matriculaAlunoStatusEnum = status;
    }
}
