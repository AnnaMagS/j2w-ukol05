package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
@RequestMapping("/")
public class RegistraceController {

  @GetMapping("")
  public ModelAndView formular() {
    ModelAndView formular = new ModelAndView("/formular");
    formular.addObject("form",new RegistraceForm());
    return formular;
  }

  @PostMapping("")
  public Object form(@ModelAttribute("form") @Valid RegistraceForm form, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "/formular";
    }

    LocalDate datumNarozeni = LocalDate.parse(form.getVek());
    Period period = datumNarozeni.until(LocalDate.now());
    int vekRoky = period.getYears();
    if (vekRoky < 9 || vekRoky > 15) {
      bindingResult.rejectValue("vek", "", "Registrovat se mohou pouze děti mezi 9 až 15 lety věku.");
      return "/formular";
    }

    if (form.getVyber().size()<2){
      bindingResult.rejectValue("vyber", "", "Musíš si vybrat alespoň dva sporty");
      return "/formular";
    }

    return new ModelAndView("/registrovano")
            .addObject("registr", form);
  }

}
