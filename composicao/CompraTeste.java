package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.cliente = "Guilherme";
		compra1.adicionarItem(new Item("jabuticaba", 10, 10.99));
		compra1.adicionarItem(new Item("macarr�o", 1, 8.99));
		compra1.adicionarItem(new Item("feijao", 1, 3.99));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
		
		
		
	}
}
