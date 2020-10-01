package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.*;

@Controller
public class TarefasController {
	
	@RequestMapping("/")
	public String execute() {
		System.out.println("L�gica do MVC");
		return "info";
	}
	
	@RequestMapping("criaTarefa")
	public String form() {
		return "formTarefa";
	}
	
	@RequestMapping("adicionaTarefa")
	public String adiciona(Tarefa tarefa) {
		TarefasDAO dao = new TarefasDAO();
		dao.adicionaDescricao(tarefa);
		return "adicionada";
	}
}