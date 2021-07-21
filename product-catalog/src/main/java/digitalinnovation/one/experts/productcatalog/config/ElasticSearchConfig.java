package digitalinnovation.one.experts.productcatalog.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchEntityMapper;
import org.springframework.data.elasticsearch.core.EntityMapper;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration // configuração de como criar objetos
// mostra aonde encontrar os repositories
@EnableElasticsearchRepositories(basePackages = "digitalinnovation.one.experts.productcatalog.repository")

// extende uma classe de configuração do elasticsearch
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

    @Override
    // interface do elasticsearch chamada resthighlevelclient
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
                // mostra aonde se encontra o elasticsearch
                .connectedTo("localhost:9200", "localhost:9300")
                .build();
        return RestClients.create(clientConfiguration).rest();
    }

    // cria o objeto e deixa ele disponível para outras classes utilizarem ele como dependência
    @Bean
    @Override
    public EntityMapper entityMapper() {
        // cria o objeto elasticsearchentitymapper
        ElasticsearchEntityMapper entityMapper = new ElasticsearchEntityMapper(elasticsearchMappingContext(),
                new DefaultConversionService());
        // adiciona conversões
        entityMapper.setConversions(elasticsearchCustomConversions());
        // retorna entitymapper
        return entityMapper;
    }
}
