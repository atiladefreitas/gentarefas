package com.taskmanager.jsf.atila;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Tarefas {

	private String titulo;
	private String descricao;
	private String responsavel;
	private String prioridade;
	private Date deadline;
	
	// lista de opções responsavel
	List<String> respOptions;
	
	// list de opções prioridade
	List<String> prioOptions;
	
	// no-arg constructor
	public Tarefas() {
		// preencher a lista de responsaveis]
		respOptions = new ArrayList<>();
		
		respOptions.add("Fulano");
		respOptions.add("Beltrano");
		respOptions.add("Ciclano");
		
		// preencher prioridade
		prioOptions = new ArrayList<>();
		
		prioOptions.add("Alta");
		prioOptions.add("Media");
		prioOptions.add("Baixa");
		
	}

	// getter para opções de responsáveis
	public List<String> getRespOptions() {
		return respOptions;
	}

	// getter para opções de prioridade
	public List<String> getPrioOptions() {
		return prioOptions;
	}
	
	// getter/setter
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	
	
}
