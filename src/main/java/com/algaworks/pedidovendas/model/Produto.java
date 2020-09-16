package com.algaworks.pedidovendas.model;

public class Produto {

	private Long id;
	private String sku;
	private String nome;
	private String categoria;
	private String subCategoria;
	private double valorUnitario;
	private int quantidade;

	public Produto(Long id, String sku, String nome, String categoria, String subCategoria, double valorUnitario, int quantidade) {
		this.id = id;
		this.sku = sku;
		this.nome = nome;
		this.categoria = categoria;
		this.subCategoria = subCategoria;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	public final Long getId() {
		return id;
	}

	public final void setId(Long id) {
		this.id = id;
	}

	public final String getSku() {
		return sku;
	}

	public final void setSku(String sku) {
		this.sku = sku;
	}

	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final String getCategoria() {
		return categoria;
	}

	public final void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public final String getSubCategoria() {
		return subCategoria;
	}

	public final void getSubCategoria(String subCategoria) {
		this.subCategoria = subCategoria;
	}

	public final double getValorUnitario() {
		return valorUnitario;
	}

	public final void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public final int getQuantidade() {
		return quantidade;
	}

	public final void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}