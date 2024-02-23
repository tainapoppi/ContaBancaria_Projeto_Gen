package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	private ArrayList <Conta> ListaContas = new ArrayList<Conta>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		
		
	}

	@Override
	public void listarTodas() {
		for (var conta : ListaContas) {
			conta.visualizar();
		}
		
	}
	@Override
	public void cadastrar(Conta conta) {
	ListaContas.add(conta);
	System.out.println("\nA conta número: " + conta.getNumero() + "foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(Conta conta) {
		
		
	}

	@Override
	public void deletar(int numero) {
		
		
	}

	@Override
	public void sacar(int numero, float valor) {
		
		
	}

	@Override
	public void depositar(int numero, float valor) {
		
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		
		
	}
    public int gerarNumero() {
    	return ++ numero;
    	
    }
}
