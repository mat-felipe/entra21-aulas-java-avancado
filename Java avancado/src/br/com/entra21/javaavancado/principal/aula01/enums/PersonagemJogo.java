package br.com.entra21.javaavancado.principal.aula01.enums;

public enum PersonagemJogo {
	
	BARBARO(1000,"Muito HP"), ANAO(100,"Ferreiro"), DRUIDA(50,"Suporte"), SACERDOTE(10,"Cura e corre");
	
	private final int HP;
	private final String DESCRICAO;
	
	private PersonagemJogo(int hp, String descricao) {
		this.HP = hp;
		this.DESCRICAO = descricao;
				
	}

	public int getHP() {
		return HP;
	}

	public String getDESCRICAO() {
		return DESCRICAO;
	}
	
	public String getDetails() {
		return "Veja a descrição completa do " + this.name() + " sua vida é " +this.HP + " e sua habilidade principal " +this.DESCRICAO;
	}

}
