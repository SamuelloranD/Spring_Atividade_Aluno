package alunoonline.alunoonline.service;

import alunoonline.alunoonline.enums.MatriculaAlunoStatusEnum;
import alunoonline.alunoonline.model.MatriculaAluno;
import alunoonline.alunoonline.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaAlunoService {

    @Autowired
    MatriculaAlunoRepository matriculaAlunoRepository;

    public void criarMatricula(MatriculaAluno matriculaAluno) {
        matriculaAluno.setStatus(MatriculaAlunoStatusEnum.MATRICULADO);
        matriculaAlunoRepository.save(matriculaAluno);
    }
}