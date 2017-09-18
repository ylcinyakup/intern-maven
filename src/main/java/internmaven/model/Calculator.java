package internmaven.model;

public class Calculator {

	private Double sayi1 = 0d;

	private Double sayi2 = 0d;

	private Double sonuc = 0d;

	public Calculator(Double sayi1, Double sayi2) {
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
	}

	public Calculator(Double sayi1, Double sayi2, Double sonuc) {
		this.sayi1 = sayi1;
		this.sayi2 = sayi2;
		this.sonuc = sonuc;
	}

	public Calculator() {
	}

	public Double getSayi1() {
		return sayi1;
	}

	public void setSayi1(Double sayi1) {
		this.sayi1 = sayi1;
	}

	public Double getSonuc() {
		return sonuc;
	}

	public void setSonuc(Double sonuc) {
		this.sonuc = sonuc;
	}

	public Double getSayi2() {
		return sayi2;
	}

	public void setSayi2(Double sayi2) {
		this.sayi2 = sayi2;
	}

}
