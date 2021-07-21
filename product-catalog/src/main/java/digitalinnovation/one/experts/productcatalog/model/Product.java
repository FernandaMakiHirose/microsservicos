package digitalinnovation.one.experts.productcatalog.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

// mostra como vai armazenar o produto
@Document(indexName = "product", type = "catalog")

// essa classe representa o produto
public class Product {

    @Id
    // id
    private Integer id;
    // nome
    private String name;
    // quantidade
    private Integer amount;

    // get e set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
