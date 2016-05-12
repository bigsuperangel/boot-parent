package org.boot.pojo;

/**
 * Hello world!
 *
 */
public class App {
	private Long userId;
	private String name;

	public App(Long userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	public App(String name) {
		super();
		this.name = name;
	}



	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "App [userId=" + userId + ", name=" + name + "]";
	}

}
