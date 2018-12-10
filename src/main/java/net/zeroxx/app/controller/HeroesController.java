package net.zeroxx.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.zeroxx.app.model.Heroe;
import net.zeroxx.app.services.HeroesServiceImpl;
import net.zeroxx.app.services.IHeroesService;

@Controller
public class HeroesController {
	
	//@Autowired
	private IHeroesService serviceHeroes = null;
	
	public HeroesController() {
		serviceHeroes = new HeroesServiceImpl();
	}
	@RequestMapping(value = "/heroes", method = RequestMethod.GET)
	public String index(Model model) {
		List<Heroe> lista = serviceHeroes.getHeroes();
		model.addAttribute("lista",lista);
		return "heroes";
	}
}
