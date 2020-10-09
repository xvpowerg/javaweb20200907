#Entity
* 一個Entity可對應到一組資料表
* 必須指定@Entity才可為Entity
* 必須設定@Id指定主鍵
```java
@Entity
public class MyUser {
	@Id// 設為主鍵
	@GeneratedValue //產生流水號
	private int id;
	private String account;
	private String password;
	public int getId() {
		return id;
	}
............
}
```

# [EntityManager](https://docs.oracle.com/javaee/7/api/javax/persistence/EntityManager.html)
* 物件寫入資料庫 persist(arg0);
* 可以移除 指的是 跟EntityManager 脫離關係 detach(arg0);
* 可以移除 這才是由資料庫移除 remove(arg0);
*	可更新 merge(arg0)
* 可查詢 createNamedQuery(arg0)
