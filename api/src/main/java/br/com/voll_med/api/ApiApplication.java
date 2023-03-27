package br.com.voll_med.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApiApplication.class, args);
	}
	
}



/**
 * Instanciar o Spring Eureka para comunicar duas apis.
 * Pesquisar em vídeos como fazer requisição interna de uma api para outra
 *
 * Minha api vai possui variaveis de ambiente, para se authenticar com
 * a api da Orbital. Com isso você tem que saber o end point da api.
 *
 * Apos receber um token, a api vai conseguir pegar alguns
 * dados da conta do cliente.
 *
 * Criar funcao para authenticar.
 *
 * Criar funcao para validar a validade do token,
 * caso contrario deve solicitar um token novamente.
 *
 * Após authenticado a api deve retornar os dados do usuário.
 *
 * Criar um serviço de cache
 * Armazenar no banco de dados todas a requisições
 * Utilizar Cache para o token
*/