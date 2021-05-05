# Úkol 5

Vytvoř stránku pro registraci na letní dětský tábor. Stránka bude obsahovat formulář, po jeho odeslání se provede validace. Pokud bude formulář v pořádku,
zobrazí se stránka s rekapitulací zadaných údajů. Pokud bude ve formuláři nějaká chbya, zobrazí se znovu formulář, údaje zadané uivatelem v něm budou vyplněné
a u políček s chybou bude vypsána chybová zpráva.  

1. Udělej fork zdrojového repository do svého účtu na GitHubu, případně pokračuj ve svém úkolu z předchozí lekce.
1. Naklonuj si repository **ze svého účtu** na GitHubu na lokální počítač.
1. Spusť si naklonovanou aplikaci a otevři v prohlížeči stránku [http://localhost:8080/](http://localhost:8080/). Zobrazí se stránka s textem „TODO“.
1. Vytvoř přepravku (Java Bean) pro uložení údajů formuláře `RegistraceForm`. Vytvoř `enum` pro sport (pojmenuj jej `Sport`) a pro pohlaví (`Pohlavi`). Seznam sportů bude
   v přepravce evidován jako `EnumSet<Sport>`.
1. Vytvoř metodu controlleru, která bude přijímat údaje z formuláře v `RegistraceForm`.
1. Vytvoř HTML formulář s následujícími údaji. Na vzhledu formuláře tolik nezáleží, pokud ale chceš bez psaní stylů vytvořit docela použitelný formulář,
   můžeš použít knihovnu Bootstrap.
   Údaje o účastníkovi (dítěti):
   * jméno (povinný údaj)
   * příjmení (povinný údaj)
   * datum narození (povinný údaj)
   * pohlaví (chlapec/dívka – povinný údaj)
   * zvolené sporty (např. plavání, běh, cyklistika, fotbal, basketbal – formou checkboxů)
   * turnus (např. 5. až 11. července, 12. až 18. července, 19. až 25. července – povinný údaj)
   * e-mail na rodiče (volitelný údaj)
   * telefon na rodiče (volitelný údaj)
1. Nakonfiguruj validaci údaj z formuláře v Javě.
1. V metodě controlleru zkontroluj následující podmínky. Pokud nebudou splněné, zařiď, aby se u příslušného políčka vypsala odpovídající chybová zpráva. 
   * věk mezi 9 a 15 roky (včetně) – připomínám kód pro výpočet věku:
     ```java
     Period period = birthDate.until(LocalDate.now());
     int vek = period.getYears();
     ```
   * vybrané alespoň dva sporty – `EnumSet` má metodu `size()`, která vrací počet prvků v množině
1. Vytvoř stránku pro zobrazení rekapitulace registrace. Můžeš zkopírovat stránku s formulářem a místo `input`ů použít `span`y, případně inputům nastav atribut `readonly`.   
1. Zkontroluj, zda vše funguje.
1. *Commitni* a *pushnni* změny (výsledný kód) do svého repository na GitHubu.
1. Vlož odkaz na své repository do tabulky s úkoly na Google Drive.

## Bootstrap
Pokud chceš vytvořit formulář, který bude vypadat docela rozumně, a nechceš vytvářet vlastní styly, můžeš použít [Bootstrap](https://getbootstrap.com/). Popis
vložení Bootstrapu do stránky je v dokumentaci na stránce [Introduction](https://getbootstrap.com/docs/5.0/getting-started/introduction/). Důležité je do
hlavičky stránky vložit element `<link>`odkazující na `bootstrap.min.css` (v kódu bude celá cesta, tak, jak je uvedená na stránkách Bootstrapu). Stránka dále
popisuje vložení JavaScriptové knihovny používané Bootstrapem, ta není pro formuláře potřeba.

Na další stránce je popis [formulářů v Bootstrapu](https://getbootstrap.com/docs/5.0/forms/overview/). Obvykle stačí najít si v dokumentaci vzorový kód, ten si
zkopírovat do své stránky a upravit jej – zejména upravit texty a atributy `name` a `id` u elementů `<input>` a atrinbut `for` u elementů `<label>`.

Formuláře Bootstrapu obsahují i sekci [Validation](https://getbootstrap.com/docs/5.0/forms/validation/), kde je popsáno, jakým způsobem lze uživateli zobrazovat validační zprávy.

## Odkazy

* odkaz na stránku [Lekce 6](https://java.czechitas.cz/2021-jaro/java-2/lekce-6.html)
* Java SE 11 [Javadoc](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/) – dokumentace všech tříd, které jsou součástí základní Javy ve verzi 11.
* Dokumentace [Spring Boot](https://spring.io/projects/spring-boot#learn) – odsud je anotace `@SpringBootApplication` a třída `SpringApplication`.
* Dokumentace [Spring Framework](https://spring.io/projects/spring-framework#learn) – odsud jsou anotace `@Controller`, `@GetRequest` a třída `ModelAndView`.
* Dokumentace [Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html) – šablonovací systém pro HTML použitý v projektu.
* Dokumentace [Hibernate Validator](https://hibernate.org/validator/documentation/)
* [Unsplash](https://unsplash.com) – obrázky a fotografie k použití zdarma
* [LineAwesome](https://icons8.com/line-awesome) – sada ikon pro použití na webu
* [Bootstrap](https://getbootstrap.com/) – CSS framework, který můžeš použít pro vytvoření formuláře.
