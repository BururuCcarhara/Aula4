package Lore;

public class nome {
	 String nome;
	 String velocidade;
	 String cor;
	 String tamanho;
	 String assento;
	
	 public nome(String nome, String velocidade, String cor, String tamanho, String assento) {
	        this.nome = nome;
	        this.velocidade = velocidade;
	        this.cor = cor;
	        this.tamanho = tamanho;
	        this.assento = assento;
	 }
	        public String getNome() {
	            return nome;
	        }
	        public void setNome(String nome) {
	            this.nome = nome;
	        }
	        public String getVelocidade() {
	            return velocidade;
	        }
	        public void setVelocidade(String velocidade) {
	            this.velocidade = velocidade;
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
	        public String getAssento() {
	        	return assento;
	        }
	        public void setAssento(String assento) {
	        	this.assento = assento;
	        }
	 
	  public static void main(String[] args) {
		  nome objeto = new nome("Avião", "100 km/h", "branco e vermelho", "Grande", "ocupados");
		  
		    System.out.println("Nome: " + objeto.getNome());
	        System.out.println("Velocidade: " + objeto.getVelocidade());
	        System.out.println("Cor: " + objeto.getCor());
	        System.out.println("Tamanho: " + objeto.getTamanho());
	        System.out.println("assento: " + objeto.getAssento());
	           
	  }
	            
	    }
