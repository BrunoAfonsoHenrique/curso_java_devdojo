package estudosjava.Jenums.classes;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa Física"), PESSOA_JURIDICA(2, "Pessoa Juridica"){
		public String getId() {
			return "B";
		}
	};
	
	private int tipo;
	private String nome;
	
	TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}
	
	public String getId() {
		return "A";
	}
	
	public int getTipo() {
		return tipo;
	}
	
	public String getNome() {
		return nome;
	}

}
