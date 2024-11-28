import java.util.*;

public class NewsAgency {
	List<Subscriber> subcribers = new ArrayList<>();

	public void addSubcriber(Subscriber user) {
		subcribers.add(user);
	}

	public void removeSubcriber(Subscriber user) {
		subcribers.remove(user);
	}

	public String notifyUsers() {
		StringBuilder news = new StringBuilder();
		for (Subscriber subscriber : subcribers) {
			news.append("Hello " + subscriber.getUser() + ", here's the breaking news!!" + "\n");
		}
		return news.toString();
	}
}
