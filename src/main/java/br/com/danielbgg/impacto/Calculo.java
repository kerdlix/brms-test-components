package br.com.danielbgg.impacto;

public class Calculo implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private double scoreOrigem;

	private double scoreDestino;

	private java.lang.String segmentoDestino;

	private java.lang.String ratingDestino;

	private java.lang.String setorOrigem;

	private double pagamento;

	private java.util.List<Recebimento> recebimentos;

	private double _totalReceb;

	private double _pesoRelac;

	private double _impacto;

	private double _fatorAbsorcao;

	private double _fatorImpacto;

	private double _scoreFinal;

	public Calculo() {
	}

	public java.util.List<Recebimento> getRecebimentos() {
		return this.recebimentos;
	}

	public void setRecebimentos(java.util.List<Recebimento> recebimentos) {
		this.recebimentos = recebimentos;
	}

	public double get_totalReceb() {
		return this._totalReceb;
	}

	public void set_totalReceb(double _totalReceb) {
		this._totalReceb = _totalReceb;
	}

	public double getScoreOrigem() {
		return this.scoreOrigem;
	}

	public void setScoreOrigem(double scoreOrigem) {
		this.scoreOrigem = scoreOrigem;
	}

	public double getScoreDestino() {
		return this.scoreDestino;
	}

	public void setScoreDestino(double scoreDestino) {
		this.scoreDestino = scoreDestino;
	}

	public java.lang.String getSegmentoDestino() {
		return this.segmentoDestino;
	}

	public void setSegmentoDestino(java.lang.String segmentoDestino) {
		this.segmentoDestino = segmentoDestino;
	}

	public java.lang.String getRatingDestino() {
		return this.ratingDestino;
	}

	public void setRatingDestino(java.lang.String ratingDestino) {
		this.ratingDestino = ratingDestino;
	}

	public java.lang.String getSetorOrigem() {
		return this.setorOrigem;
	}

	public void setSetorOrigem(java.lang.String setorOrigem) {
		this.setorOrigem = setorOrigem;
	}

	public double getPagamento() {
		return this.pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public String toString() {
		return "Calculo [scoreOrigem=" + scoreOrigem + ", scoreDestino=" + scoreDestino + ", segmentoDestino="
				+ segmentoDestino + ", ratingDestino=" + ratingDestino + ", setorOrigem=" + setorOrigem + ", pagamento="
				+ pagamento + ", recebimentos=" + recebimentos + ", _totalReceb=" + _totalReceb + ", _pesoRelac="
				+ _pesoRelac + ", _impacto=" + _impacto + ", _fatorAbsorcao=" + _fatorAbsorcao + ", _fatorImpacto="
				+ _fatorImpacto + ", _scoreFinal=" + _scoreFinal + "]";
	}

	public Calculo(double _totalReceb, java.util.List<Recebimento> recebimentos, double scoreOrigem,
			double scoreDestino, java.lang.String segmentoDestino, java.lang.String ratingDestino,
			java.lang.String setorOrigem, double pagamento) {
		this._totalReceb = _totalReceb;
		this.recebimentos = recebimentos;
		this.scoreOrigem = scoreOrigem;
		this.scoreDestino = scoreDestino;
		this.segmentoDestino = segmentoDestino;
		this.ratingDestino = ratingDestino;
		this.setorOrigem = setorOrigem;
		this.pagamento = pagamento;
	}

	public double get_pesoRelac() {
		return this._pesoRelac;
	}

	public void set_pesoRelac(double _pesoRelac) {
		this._pesoRelac = _pesoRelac;
	}

	public double get_impacto() {
		return this._impacto;
	}

	public void set_impacto(double _impacto) {
		this._impacto = _impacto;
	}

	public double get_fatorAbsorcao() {
		return this._fatorAbsorcao;
	}

	public void set_fatorAbsorcao(double _fatorAbsorcao) {
		this._fatorAbsorcao = _fatorAbsorcao;
	}

	public double get_fatorImpacto() {
		return this._fatorImpacto;
	}

	public void set_fatorImpacto(double _fatorImpacto) {
		this._fatorImpacto = _fatorImpacto;
	}

	public double get_scoreFinal() {
		return this._scoreFinal;
	}

	public void set_scoreFinal(double _scoreFinal) {
		this._scoreFinal = _scoreFinal;
	}

	public Calculo(double scoreOrigem, double scoreDestino, java.lang.String segmentoDestino,
			java.lang.String ratingDestino, java.lang.String setorOrigem, double pagamento,
			java.util.List<Recebimento> recebimentos, double _totalReceb, double _pesoRelac, double _impacto,
			double _fatorAbsorcao, double _fatorImpacto, double _scoreFinal) {
		this.scoreOrigem = scoreOrigem;
		this.scoreDestino = scoreDestino;
		this.segmentoDestino = segmentoDestino;
		this.ratingDestino = ratingDestino;
		this.setorOrigem = setorOrigem;
		this.pagamento = pagamento;
		this.recebimentos = recebimentos;
		this._totalReceb = _totalReceb;
		this._pesoRelac = _pesoRelac;
		this._impacto = _impacto;
		this._fatorAbsorcao = _fatorAbsorcao;
		this._fatorImpacto = _fatorImpacto;
		this._scoreFinal = _scoreFinal;
	}

}