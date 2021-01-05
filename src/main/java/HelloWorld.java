import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello1", (req, res) -> "Hello DRV! This is your first pipeline deployment..Enjoy!");
	}
}
