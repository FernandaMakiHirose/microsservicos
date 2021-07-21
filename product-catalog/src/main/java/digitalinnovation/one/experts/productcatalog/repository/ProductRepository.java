package digitalinnovation.one.experts.productcatalog.repository;

import digitalinnovation.one.experts.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// o repository faz o crud, por isso o crudrepository foi extendido, foi passado a classe e o tipo de dado da chave primária
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
