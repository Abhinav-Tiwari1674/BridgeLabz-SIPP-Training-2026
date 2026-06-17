public class checkedexceptionhandling {
	static void riskyOperation() throws java.io.IOException {
		throw new java.io.IOException("Simulated checked IOException from riskyOperation");
	}
	static void propagateExample() throws java.text.ParseException {
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		sdf.parse("invalid-date");
	}
    public static void main(String[] args) {
		try {
			riskyOperation();
		} catch (java.io.IOException e) {
			System.out.println("Caught IOException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());
		}
		try {
			propagateExample();
		} catch (java.text.ParseException e) {
			System.out.println("Caught ParseException: " + e.getMessage());
		}

		System.out.println("Program finished.");
	}
}


