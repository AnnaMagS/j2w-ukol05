package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

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
      return "formular";
    }

/*    if (form.getVek() < 18) {
      return "/alkohol/nizky-vek";

      bindingResult.rejectValue("vek", "", "To by nešlo. Nejsi náhodou starší?");
      return "/alkohol/formular";

    }*/

    return new ModelAndView("/registrovano")
      //      .addObject("kod", Math.abs(random.nextInt()))
            .addObject("registr", form);
  }

}
