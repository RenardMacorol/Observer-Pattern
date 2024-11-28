public class App {

	public static void main(String[] args) {
		NewsAgency cnn = new NewsAgency();
		Subscriber renard = new Subscriber("Renard");
		Subscriber wonka = new Subscriber("Wonka");
		Subscriber erika = new Subscriber("Erika");

		cnn.getService().addSubcriber(renard);
		cnn.getService().addSubcriber(wonka);
		cnn.getService().addSubcriber(erika);
		cnn.getService().notifyUsers();

		cnn.getService().removeSubcriber(erika);
		cnn.getService().addSubcriber(wonka);
		cnn.getService().notifyUsers();
	}
}
