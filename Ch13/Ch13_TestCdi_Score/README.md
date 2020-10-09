## @RequestScoped
可將物件放置於RequestScoped
```java
@RequestScoped
public class TestRequestScore {
	private String name = "Empty";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestRequestScore [name=" + name + "]";
	}
	
}
```
## @SessionScoped
可將物件放置於SessionSScoped注意物件必須是Serializable
```java
@SessionScoped
public class TestSessionScoped implements Serializable {
private String name = "Empty";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TestSessionScoped [name=" + name + "]";
	}
	
}

}
```
## @ApplicationScoped 可放置Application的內容

```java
@ApplicationScoped
public class TestApplicationScoped {
	
		private String name = "Empty";
		private int count = 0;
		public int getCount() {
			return count;
		}
		public void add() {
			count++;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		

		@Override
		public String toString() {
			return "TestRequestScore [name=" + name + "]";
		}
		
}
```
