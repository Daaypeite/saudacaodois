package com.example.saudacaodois.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.saudacaodois.model.Saudacao;

@RestController
public class SaudacaoController {

	// dois atributos que serao inicializados
	private static final String modelo = "Ola, %s";
	private final AtomicLong contador = new AtomicLong();

	@RequestMapping("/saudacao")
	public Saudacao saudar(@RequestParam(value = "name", defaultValue = "world") String nome) {
		return new Saudacao(contador.incrementAndGet(), String.format(modelo, nome));
	}
}
