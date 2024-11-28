import java.util.*;

public class NewsAgency {
	private final SubscriberServiceProvider service;

	public NewsAgency() {
		service = new SubscriberServiceProvider();

	}

	public void breakingNewsUpdate() {
		service.notifyUsers();
	}

	public SubscriberServiceProvider getService() {
		return service;
	}

}
