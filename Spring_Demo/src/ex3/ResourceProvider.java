package ex3;

public class ResourceProvider {
	public ResourceProvider() {
		System.out.println("Provider Constructor");
	}

	private static ResourceProvider provider;

	private static ResourceProvider getProvider() {
		System.out.println("Provider Singleton");
		if (provider == null)
			provider = new ResourceProvider();

		return provider;
	}

}
