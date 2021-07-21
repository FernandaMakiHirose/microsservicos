package digitalinnovation.one.experts.shoppingcart.controller;

import digitalinnovation.one.experts.shoppingcart.model.Cart;
import digitalinnovation.one.experts.shoppingcart.model.Item;
import digitalinnovation.one.experts.shoppingcart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// mostra que é um restcontroller
@RestController

// a rota que mostra o serviço
@RequestMapping(value = "/cart")
public class CartController {

    // injeta a instância
    @Autowired
    // busca a instância
    private CartRepository cartRepository;

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    // método que adiciona o item
    public Cart addItem(@PathVariable("id") Integer id, @RequestBody Item item) {
        // vê se tem um carrinho criado com esse id
        Optional<Cart> savedCart = cartRepository.findById(id);
        Cart cart;
        // se não tem um carrinho cria um carrinho do zero
        if (savedCart.equals(Optional.empty())) {
            cart = new Cart(id);
        }
        else {
            cart = savedCart.get();
        }
        // se tem o carrinho com o id adiciona um item dele
        cart.getItems().add(item);
        return cartRepository.save(cart);
    }

    // método que busca o carrinho pelo id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Cart> findById(@PathVariable("id") Integer id) {
        return cartRepository.findById(id);
    }

    // método que apaga tudo no carrinho
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void clear(@PathVariable("id") Integer id) {
        cartRepository.deleteById(id);
    }

}
