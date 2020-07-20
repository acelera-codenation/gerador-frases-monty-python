package challenge;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quote")
public class QuoteController {

    private QuoteService service;

    public QuoteController(QuoteService service) {
        this.service = service;
    }

    @GetMapping
    public Quote getQuote() {
        return service.getQuote();
    }

    @GetMapping("/{actor}")
    public Quote getQuoteByActor(@PathVariable String actor) {
        return service.getQuoteByActor(actor);
    }

}