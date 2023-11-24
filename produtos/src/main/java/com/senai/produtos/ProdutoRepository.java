package com.senai.produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository
        extends JpaRepository<Produto, Integer> {
    List<Produto> findByNomeContainingIgnoreCase(String nome);
    List<Produto> findByDescricaoContainingIgnoreCase(String descricao);
    List<Produto> findByCategoriaContainingIgnoreCase(String categoria);
    List<Produto> findByCondicaoContainingIgnoreCase(String condicao);
    @Query("SELECT p FROM Produto p WHERE (p.valor >= :vi" +
            "AND p.valor <= :vf")
    List<Produto> findByValues(@Param("vi") double vi,
                               @Param("vf") double vf);
}
