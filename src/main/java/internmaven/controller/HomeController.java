package internmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import internmaven.model.Calculator;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String goHome() {

		return "home";
	}

	@RequestMapping(value = { "/islem" }, method = RequestMethod.GET)
	public String islem(Model model) {

		model.addAttribute("calculator", new Calculator());
		return "islem";
	}

	@RequestMapping(value = { "/islem" }, method = RequestMethod.POST, params = "topla")
	public String toplamaIslemi(Model model, @ModelAttribute("calculator") Calculator calculator) {
		double sonuc = calculator.getSayi1() + calculator.getSayi2();
		calculator.setSonuc(sonuc);
		model.addAttribute("sonuc", sonuc);
		model.addAttribute("calculator", calculator);
		return "islem";
	}

	@RequestMapping(value = { "/islem" }, method = RequestMethod.POST, params = "cikart")
	public String cikartmaIslemi(Model model, @ModelAttribute("calculator") Calculator calc) {

		double sonuc = calc.getSayi1() - calc.getSayi2();
		calc.setSonuc(sonuc);
		model.addAttribute("sonuc", sonuc);
		model.addAttribute("Calculator", calc);
		return "islem";
	}

	@RequestMapping(value = { "/islem" }, method = RequestMethod.POST, params = "carp")
	public String carpmaIslemiIslemi(Model model, @ModelAttribute("calculator") Calculator calc) {
		double sonuc = calc.getSayi1() * calc.getSayi2();
		calc.setSonuc(sonuc);
		model.addAttribute("sonuc", sonuc);
		model.addAttribute("Calculator", calc);
		return "islem";
	}

	@RequestMapping(value = { "/islem" }, method = RequestMethod.POST, params = "bol")
	public String BolmeIslemiIslemi(Model model, @ModelAttribute("calculator") Calculator calc) {
		if (calc.getSayi2() == 0 || calc.getSayi2() < 0) {
			model.addAttribute("sonuc", "sayi2 0 ve 0dan küçük olamaz");
			return "islem";
		}

		double sonuc = calc.getSayi1() / calc.getSayi2();
		calc.setSonuc(sonuc);
		model.addAttribute("sonuc", sonuc);
		model.addAttribute("Calculator", calc);
		return "islem";
	}

}
