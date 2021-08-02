
class NishinHyouji implements Observer{
	public void update(Subject s) {
    print(((Suuchi)s).getValue());
	}

	private void print(int n) {
		System.out.println(n+"2進数で表示します");

	}

}
