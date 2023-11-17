package com.senai.produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepository
        extends JpaRepository<Produto, Integer> {
    List<Produto> findByNomeContainingIgnoreCase(String nome);
    List<Produto> findByDescricaoContainingIgnoreCase(String descricao);
}
