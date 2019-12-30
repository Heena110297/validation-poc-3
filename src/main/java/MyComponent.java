

public class MyComponent {

	public static Object process(@Payload Example req) throws Exception {
		if(null == req.getKey1()) {
			throw new Exception();
		}
        return req;
	}
}
