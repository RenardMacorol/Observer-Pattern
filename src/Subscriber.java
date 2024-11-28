public class Subscriber implements SubscriberObserver {
	private String user;

	Subscriber(String user) {
		this.user = user;
	}

	public void notifySubscriber() {
		System.out.println(user);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
