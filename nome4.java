package Lore;

public class nome4 {

	public static void main(String[] args) {
		Animal1 animal1= new animal1();
		Animal2 animal2= new animal2();
		
	animal1.setanimal("cavalo");
	animal1.setnome("carlinhos");
	animal1.settamanho(1.6);
	animal1.setgenero("macho");
	animal1.setcor("branco");
	
	System.out.println(animal1.getanimal());
	System.out.println(animal1.getnome());
	System.out.println(animal1.gettamanho());
	System.out.println(animal1.getgenero());
	System.out.println(animal1.getcor());
	
	animal2.setanimal("égua");
	animal2.setnome("Dalva");
	animal2.settamanho(1.6);
	animal2.setgenero("fêmea");
	animal2.setcor("branca com marrom");
	
	System.out.println(animal2.getanimal());
	System.out.println(animal2.getnome());
	System.out.println(animal2.gettamanho());
	System.out.println(animal2.getgenero());
	System.out.println(animal2.getcor());
	
	
	}

}
