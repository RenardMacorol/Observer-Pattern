public class Subscriber {
	private String user;

	Subscriber(String user) {
		this.user = user;
	}

	public void notifySubscriber() {
		StringBuilder news = new StringBuilder();
		news.append("Hello " + user + ", here's the breaking news!!" + "\n");
		System.out.println(news.toString());

	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

}
