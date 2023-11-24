package com.senai.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import java.util.Arrays;

@SpringBootApplication
public class ProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}
	@Bean
	CommandLineRunner criarProdutos(ProdutoRepository pr) {
		return args -> {
			pr.deleteAll();

			Produto p1 = new Produto(
					"Sapato EPI",
					"Sapato para proteção",
					CategoriaEnum.BOTA.getCategoria(),
					57.99, CondicaoEnum.NOVO.getCategoria());
			Produto p2 = new Produto(
					"Tênis Adidas Branco",
					"Tênis Adidas Branco muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					209.99, CondicaoEnum.USADO.getCategoria());
			Produto p3 = new Produto(
					"Tênis Adidas Preto",
					"Tênis Adidas Preto muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					230.99, CondicaoEnum.NOVO.getCategoria());
			Produto p4 = new Produto(
					"Tênis Adidas Roxo",
					"Tênis Adidas Roxo muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					320.99, CondicaoEnum.USADO.getCategoria());
			Produto p5 = new Produto(
					"Tênis Adidas Azul",
					"Tênis Adidas Azul muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					327.92, CondicaoEnum.NOVO.getCategoria());
			Produto p6 = new Produto(
					"Tênis Adidas Amarelo",
					"Tênis Adidas Amarelo muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					302.99, CondicaoEnum.USADO.getCategoria());
			Produto p7 = new Produto(
					"Tênis Nike Branco",
					"Tênis Nike Branco muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					270.99, CondicaoEnum.NOVO.getCategoria());
			Produto p8 = new Produto(
					"Tênis Nike Preto",
					"Tênis Nike Preto muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					169.99, CondicaoEnum.USADO.getCategoria());
			Produto p9 = new Produto(
					"Tênis Nike Roxo",
					"Tênis Nike Roxo muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					180.99, CondicaoEnum.NOVO.getCategoria());
			Produto p10 = new Produto(
					"Tênis Nike Azul",
					"Tênis Nike Azul muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					257.99, CondicaoEnum.USADO.getCategoria());
			Produto p11 = new Produto(
					"Tênis Nike Amarelo",
					"Tênis Nike Amarelo muito bonito",
					CategoriaEnum.TENIS.getCategoria(),
					430.99, CondicaoEnum.NOVO.getCategoria());
			Produto p12 = new Produto(
					"Bota Preta",
					"Bota Preta muito bonita",
					CategoriaEnum.BOTA.getCategoria(),
					159.99, CondicaoEnum.USADO.getCategoria());
			Produto p13 = new Produto(
					"Chinelo Rider Azul",
					"Chinelo muito bonito",
					CategoriaEnum.CHINELO.getCategoria(),
					267.99, CondicaoEnum.NOVO.getCategoria());
			Produto p14 = new Produto(
					"Chinelo Rider Preto",
					"Chinelo muito bonito",
					CategoriaEnum.CHINELO.getCategoria(),
					340.99, CondicaoEnum.USADO.getCategoria());
			Produto p15 = new Produto(
					"Chinelo Rider Branco",
					"Chinelo muito bonito",
					CategoriaEnum.CHINELO.getCategoria(),
					390.99, CondicaoEnum.NOVO.getCategoria());
			Produto p16 = new Produto(
					"Chinelo Rider Rosa",
					"Chinelo muito bonito",
					CategoriaEnum.CHINELO.getCategoria(),
					290.99, CondicaoEnum.USADO.getCategoria());
			Produto p17 = new Produto(
					"Sapatilha Branca",
					"Sapatilha linda",
					CategoriaEnum.SAPATILHA.getCategoria(),
					170.99, CondicaoEnum.NOVO.getCategoria());
			Produto p18 = new Produto(
					"Sandália Branca",
					"Sandália Branca muito linda",
					CategoriaEnum.SANDALIA.getCategoria(),
					580.99, CondicaoEnum.USADO.getCategoria());
			Produto p19 = new Produto(
					"Sapatilha Preta",
					"Sapatilha linda",
					CategoriaEnum.SAPATILHA.getCategoria(),
					270.99, CondicaoEnum.NOVO.getCategoria());
			Produto p20 = new Produto(
					"Sandália Preta",
					"Sandália Preta muito linda",
					CategoriaEnum.SANDALIA.getCategoria(),
					390.99, CondicaoEnum.USADO.getCategoria());

			pr.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,
					p11,p12,p13,p14,p15,p16,p17,p18,p19,p20));

		};
	}
}
