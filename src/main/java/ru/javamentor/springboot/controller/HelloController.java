package ru.javamentor.springboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import java.util.List;

// Объявляем класс как контроллер Spring
@Controller
public class HelloController {

	// Обработка GET-запроса по URL "/"
	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		// Создаем список сообщений для отображения на странице
		List<String> messages = new ArrayList<>();
		messages.add("Добро пожаловать!");
		messages.add("Это CRUD-приложение с использованием SpringBOOT");

		// Передаем список сообщений в модель под именем "messages"
		model.addAttribute("messages", messages);

		// Возвращаем имя представления (шаблона) "index", значит, что будет использован файл index.html
		return "index";
	}
}