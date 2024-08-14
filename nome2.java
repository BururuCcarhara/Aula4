package Lore;

public class nome2 {

	public static void main(String[] args) {
		Aviao1 aviao1= new Aviao();
		Aviao2 aviao2= new Aviao();
		
	aviao1.setCor("branco");
	aviao1.setPorte("médio");
	aviao1.setQTdAssento(60);
	aviao1.setVelocidade(150);
	
	System.out.println(aviao1.getcor());
	System.out.println(aviao1.getporte());
	System.out.println(aviao1.getQTdAssento());
	System.out.println(aviao1.getVelocidade());
	
	aviao2.setCor("azul");
	aviao2.setPorte("médio");
	aviao2.setQTdAssento(60);
	aviao2.setVelocidade(80);
	
	System.out.println(aviao2.getcor());
	System.out.println(aviao2.getporte());
	System.out.println(aviao2.getQTdAssento());
	System.out.println(aviao2.getVelocidade());

	}

}
