package alunoonline.alunoonline.controller;

import alunoonline.alunoonline.model.Disciplina;
import alunoonline.alunoonline.model.Professor;
import alunoonline.alunoonline.service.DisciplinaService;
import alunoonline.alunoonline.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplinascasa")
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarDisciplina(@RequestBody Disciplina disciplina) {
        disciplinaService.criarDisciplina(disciplina);
    }
}
