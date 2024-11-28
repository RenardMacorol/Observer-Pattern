public class App {

	public static void main(String[] args) {
		NewsAgency cnn = new NewsAgency();
		SubscriberServiceProvider serviceProvider = cnn.getService();
		Subscriber renard = new Subscriber("Renard");
		Subscriber wonka = new Subscriber("Wonka");
		Subscriber erika = new Subscriber("Erika");

		serviceProvider.addSubcriber(renard);
		serviceProvider.addSubcriber(wonka);
		serviceProvider.addSubcriber(erika);

		cnn.breakingNewsUpdate();

		serviceProvider.removeSubcriber(wonka);
		serviceProvider.removeSubcriber(erika);
		cnn.breakingNewsUpdate();

	}
}
