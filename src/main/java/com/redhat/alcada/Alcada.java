package com.redhat.alcada;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Alcada implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private com.redhat.alcada.ClassificacaoCliente classificacaoCliente;
	private com.redhat.alcada.Pais pais;
	private int vencimentoOperacao;
	private double valorOperacao;
	private boolean indicadorPossuiGarantia;
	private java.lang.String atividade;

	private com.redhat.alcada.Comite _comite;

	private com.redhat.alcada.Comite _comiteRestritivo;

	private com.redhat.alcada.Comite _comiteFinal;

	private int _prioridadeComite;

	private int _prioridadeComiteRestritivo;

	public Alcada() {
	}

	public com.redhat.alcada.ClassificacaoCliente getClassificacaoCliente() {
		return this.classificacaoCliente;
	}

	public void setClassificacaoCliente(com.redhat.alcada.ClassificacaoCliente classificacaoCliente) {
		this.classificacaoCliente = classificacaoCliente;
	}

	public com.redhat.alcada.Pais getPais() {
		return this.pais;
	}

	public void setPais(com.redhat.alcada.Pais pais) {
		this.pais = pais;
	}

	public int getVencimentoOperacao() {
		return this.vencimentoOperacao;
	}

	public void setVencimentoOperacao(int vencimentoOperacao) {
		this.vencimentoOperacao = vencimentoOperacao;
	}

	public double getValorOperacao() {
		return this.valorOperacao;
	}

	public void setValorOperacao(double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

	public boolean isIndicadorPossuiGarantia() {
		return this.indicadorPossuiGarantia;
	}

	public void setIndicadorPossuiGarantia(boolean indicadorPossuiGarantia) {
		this.indicadorPossuiGarantia = indicadorPossuiGarantia;
	}

	public java.lang.String getAtividade() {
		return this.atividade;
	}

	public void setAtividade(java.lang.String atividade) {
		this.atividade = atividade;
	}

	public com.redhat.alcada.Comite get_comite() {
		return this._comite;
	}

	public void set_comite(com.redhat.alcada.Comite _comite) {
		this._comite = _comite;
	}

	public com.redhat.alcada.Comite get_comiteRestritivo() {
		return this._comiteRestritivo;
	}

	public void set_comiteRestritivo(com.redhat.alcada.Comite _comiteRestritivo) {
		this._comiteRestritivo = _comiteRestritivo;
	}

	public com.redhat.alcada.Comite get_comiteFinal() {
		return this._comiteFinal;
	}

	public void set_comiteFinal(com.redhat.alcada.Comite _comiteFinal) {
		this._comiteFinal = _comiteFinal;
	}

	public int get_prioridadeComite() {
		return this._prioridadeComite;
	}

	public void set_prioridadeComite(int _prioridadeComite) {
		this._prioridadeComite = _prioridadeComite;
	}

	public int get_prioridadeComiteRestritivo() {
		return this._prioridadeComiteRestritivo;
	}

	public void set_prioridadeComiteRestritivo(int _prioridadeComiteRestritivo) {
		this._prioridadeComiteRestritivo = _prioridadeComiteRestritivo;
	}

	public Alcada(com.redhat.alcada.ClassificacaoCliente classificacaoCliente, com.redhat.alcada.Pais pais,
			int vencimentoOperacao, double valorOperacao, boolean indicadorPossuiGarantia, java.lang.String atividade,
			com.redhat.alcada.Comite _comite, com.redhat.alcada.Comite _comiteRestritivo,
			com.redhat.alcada.Comite _comiteFinal, int _prioridadeComite, int _prioridadeComiteRestritivo) {
		this.classificacaoCliente = classificacaoCliente;
		this.pais = pais;
		this.vencimentoOperacao = vencimentoOperacao;
		this.valorOperacao = valorOperacao;
		this.indicadorPossuiGarantia = indicadorPossuiGarantia;
		this.atividade = atividade;
		this._comite = _comite;
		this._comiteRestritivo = _comiteRestritivo;
		this._comiteFinal = _comiteFinal;
		this._prioridadeComite = _prioridadeComite;
		this._prioridadeComiteRestritivo = _prioridadeComiteRestritivo;
	}

	@Override
	public String toString() {
		return "Alcada [classificacaoCliente=" + classificacaoCliente + ", pais=" + pais + ", vencimentoOperacao="
				+ vencimentoOperacao + ", valorOperacao=" + valorOperacao + ", indicadorPossuiGarantia="
				+ indicadorPossuiGarantia + ", atividade=" + atividade + ", _comite=" + _comite + ", _comiteRestritivo="
				+ _comiteRestritivo + ", _comiteFinal=" + _comiteFinal + ", _prioridadeComite=" + _prioridadeComite
				+ ", _prioridadeComiteRestritivo=" + _prioridadeComiteRestritivo + "]";
	}

}