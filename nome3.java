package Lore;

public class nome3 {
	String animal;
	 String nome;
	 String cor;
	 String tamanho;
	 String gênero;
	 String som;
	 public nome3(String animal, String nome, String cor, String tamanho, String gênero,String som) {
	        this.animal = animal;
	        this.nome= nome;
	        this.cor = cor;
	        this.tamanho = tamanho;
	        this.gênero = gênero;
	        this.som =som;
	 }
	        public String getAnimal() {
	            return animal;
	        }
	        public void setAnimal(String animal) {
	            this.animal = animal;
	        }
	        public String getNome() {
	            return nome;
	        }
	        public void setNome(String nome) {
	            this.nome = nome;
	        }
	        public String getCor() {
	            return cor;
	        }
	        public void setCor(String cor) {
	            this.cor = cor;
	        }
	        public String getTamanho() {
	            return tamanho;
	        }
	        public void setTamanho(String tamanho) {
	            this.tamanho = tamanho;
	        }
	        public String getGênero() {
	        	return gênero;
	        }
	        public void setGênero(String gênero) {
	        	this.gênero = gênero;
	        }
	        public String getSom() {
	        	return som;
	        }
	        public void setSom(String som) {
	        	this.som = som;
	        }
	 
	 
	  public static void main(String[] args) {
		  Nome3 objeto = new Nome3("Gato", "Dory", "Laranja, Branco e Preto", "Pequeno", "Feminino", "Mia");
	        
	        System.out.println("Animal: " + objeto.getAnimal());
	        System.out.println("Nome: " + objeto.getNome());
	        System.out.println("Cor: " + objeto.getCor());
	        System.out.println("Tamanho: " + objeto.getTamanho());
	        System.out.println("Gênero: " + objeto.getGenero());
	        System.out.println("Som: " + objeto.getSom());
	    }
	}
