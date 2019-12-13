package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gestor") //tabela do banco
public class Gestor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id; //identificador unico
	
	@Column
	private String nome;
	@Column
	private String matricula;
	@Column
	private int data_Nascimento;
	@Column
	private String setor;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getData_Nascimento() {
		return data_Nascimento;
	}
	public void setData_Nascimento(int data_Nascimento) {
		this.data_Nascimento = data_Nascimento;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
