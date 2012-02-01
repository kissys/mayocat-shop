import org.mayocat.shop.thymeleaf.*

// Place your Spring DSL code here
beans = {
  
  thymeleafTemplateResolver(org.mayocat.shop.thymeleaf.EschoppeThymeleafTemplateResolver){
    prefix = ''
    suffix = ''
    templateMode = 'LEGACYHTML5'
    cacheable = false
  }

  thymeleafTemplateEngine(org.thymeleaf.spring3.SpringTemplateEngine) {
    templateResolver = ref("thymeleafTemplateResolver")
  }

  thymeleafViewResolver(org.thymeleaf.spring3.view.ThymeleafViewResolver) {
    order = 10
    templateEngine = ref("thymeleafTemplateEngine")
    viewNames = "*.html"
  }

}