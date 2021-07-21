package digitalinnovation.one.experts.productcatalog.controller;

import digitalinnovation.one.experts.productcatalog.model.Product;
import digitalinnovation.one.experts.productcatalog.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

// mostra que é um restcontroller
@RestController

// a rota que mostra o serviço
@RequestMapping(value = "/product")
public class ProductController {

    // injeta a instância
    @Autowired
    // busca a instância
    private ProductRepository productRepository;

    // executa o post
    @RequestMapping(method = RequestMethod.POST)
    // tem uma entidade produto no corpo da requisição e retorna a entidade produto
    public Product create(@RequestBody Product product) {
        return productRepository.save(product);
    }

    @RequestMapping
    // encontra todos os produtos em uma lista
    public Iterable<Product> list() {
        return productRepository.findAll();
    }

    // parâmetro para achar o id
    @RequestMapping(value = "/{id}")
    // busca e retorna o id
    public Optional<Product> findById(@PathVariable("id") Integer id) {
        return productRepository.findById(id);
    }

    // parâmetro para achar o nome
    @RequestMapping(value = "/name/{name}")
    // busca e retorna o nome
    public Iterable<Product> findByName(@PathVariable("name") String name) {
        return productRepository.findByName(name);
    }

}
