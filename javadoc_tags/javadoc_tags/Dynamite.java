package javadoc_tags;

/**
 * Ignites two tons of dynamite to blow up all roadrunners within 250 feet.
 * <p>
 * 
 * Try using the {@linkplain ACME_Smartphone#zapRoadRunner(int)} before
 * resorting to {@linkplain #blowDynamite()}. However, if you do have a lot of
 * roadrunners, the {@code ACME_Smartphone#zapRoadRunner(int)} method may not be
 * efficient enough. You'll probably just want to resort to
 * {@code #blowDynamite()} to annihilate them all at once.
 */
public class Dynamite {

	void blowDynamite() {
		System.out.println("kabang!!! big explosion!!!");
	}

}
