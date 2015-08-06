package br.com.sisnema.financeiroweb.model;

// Generated 04/08/2015 22:19:49 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FornecedorId generated by hbm2java
 */
@Embeddable
public class FornecedorId implements java.io.Serializable {

	private int empresa;
	private int colaborador;

	public FornecedorId() {
	}

	public FornecedorId(int empresa, int colaborador) {
		this.empresa = empresa;
		this.colaborador = colaborador;
	}

	@Column(name = "empresa", nullable = false)
	public int getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}

	@Column(name = "colaborador", nullable = false)
	public int getColaborador() {
		return this.colaborador;
	}

	public void setColaborador(int colaborador) {
		this.colaborador = colaborador;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FornecedorId))
			return false;
		FornecedorId castOther = (FornecedorId) other;

		return (this.getEmpresa() == castOther.getEmpresa())
				&& (this.getColaborador() == castOther.getColaborador());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmpresa();
		result = 37 * result + this.getColaborador();
		return result;
	}

}
