public class App {

	public static void main(String[] args) {
		NewsAgency cnn = new NewsAgency();
		Subscriber renard = new Subscriber("Renard");
		Subscriber wonka = new Subscriber("Wonka");
		Subscriber erika = new Subscriber("Erika");
		cnn.addSubcriber(renard);
		cnn.addSubcriber(wonka);
		cnn.addSubcriber(erika);

		System.out.println(cnn.notifyUsers());
		cnn.removeSubcriber(wonka);

		System.out.println(cnn.notifyUsers());
	}
}
