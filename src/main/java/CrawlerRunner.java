public class CrawlerRunner {

	public static void main(String[] args) {

		Auxiliary aux = new Auxiliary();

		aux.navigateTo("https://opcoes.net.br/opcoes/bovespa/", "PETR4");
		aux.readHeaderValues();
		aux.iterateOnAtivos();


		aux.driver.close();
	}
}
