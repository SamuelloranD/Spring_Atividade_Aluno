package alunoonline.alunoonline.service;

import alunoonline.alunoonline.model.Aluno;
import alunoonline.alunoonline.model.Disciplina;
import alunoonline.alunoonline.model.Professor;
import alunoonline.alunoonline.repository.DisciplinaRepository;
import alunoonline.alunoonline.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    public Disciplina criarDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }
}
