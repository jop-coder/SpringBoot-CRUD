package com.app.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.modelo.Articulo;
import com.app.servicios.ArticuloService;


@Controller
public class ArticulosController
{
	@Autowired
	private ArticuloService service;
	//Obs.: Spring injecta el objeto a pesar de no haber declarado el setter

	@RequestMapping("/")
	public String muestraPaginaInicial(Model model)
	{
		List<Articulo> list = service.listAll();
		model.addAttribute("listaArticulos", list);

		return "index";
	}

	@RequestMapping("/nuevo")
	public String nuevoArticulo(Model model)
	{
		Articulo articulo = new Articulo();
		model.addAttribute("articulo", articulo);

		return "nuevo_articulo";
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardarArticulo(@ModelAttribute("articulo") Articulo articulo)
	{
		service.save(articulo);

		return "redirect:/";
	}

	@RequestMapping("/editar/{id}")
	public ModelAndView editarArticulo(@PathVariable(name = "id") Integer id)
	{
		ModelAndView mv = new ModelAndView("editar_articulo");

		Articulo articulo = service.get(id);
		mv.addObject("articulo", articulo);

		return mv;
	}

	@RequestMapping("/borrar/{id}")
	public String borrarArticulo(@PathVariable(name = "id") Integer id)
	{
		service.delete(id);

		return "redirect:/";
	}

}
