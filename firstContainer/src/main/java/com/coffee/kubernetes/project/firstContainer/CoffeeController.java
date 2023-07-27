package com.coffee.kubernetes.project.firstContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoffeeController {

		@Autowired
		CoffeeRepository coffeeRepository;
		
		@GetMapping("/")
		public String listCoffees(Model model) {
			model.addAttribute("coffees", coffeeRepository.findAll());
			return "list";
		}
		
		@GetMapping("/add")
		public String coffeeForm(Model model) {
			model.addAttribute("coffee", new Coffee());
			return "coffeeform";
		}
		
		@PostMapping("/process")
		public String processForm(@Validated Coffee coffee, BindingResult result) {
			if (result.hasErrors()) {
				return "coffeeform";
			}
			coffeeRepository.save(coffee);
			return "redirect:/";
		}
}
