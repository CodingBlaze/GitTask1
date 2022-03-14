import java.util.*;

final class HeavenlyBody {

	private final String name;
	private final int orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	public HeavenlyBody(String name, int orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}

	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	@Override
	public int hashCode() {
		return this.orbitalPeriod;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || obj.getClass() != this.getClass())
			return false;
		HeavenlyBody heaven = (HeavenlyBody) obj;

		return (heaven.name.equals(this.name) && heaven.orbitalPeriod == this.orbitalPeriod);
	}
}

public class Main {
	private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();

	public static void main(String[] args) {
		HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);

		temp = new HeavenlyBody("Mars", 687);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody("Deimos", 13);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Mars

		tempMoon = new HeavenlyBody("Phobos", 3);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Mars

		temp = new HeavenlyBody("Jupiter", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		tempMoon = new HeavenlyBody("Io", 18);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody("Europa", 35);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody("Ganymede", 71);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		tempMoon = new HeavenlyBody("Callisto", 167);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon); // temp is still Jupiter

		temp = new HeavenlyBody("Saturn", 10759);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Uranus", 30660);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Neptune", 165);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		temp = new HeavenlyBody("Pluto", 248);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);

		System.out.println("Planets");
		for (HeavenlyBody planet : planets) {
			System.out.println("\t" + planet.getName());
		}

		HeavenlyBody body = solarSystem.get("Mars");
		System.out.println("Moons of " + body.getName());
		for (HeavenlyBody jupiterMoon : body.getSatellites()) {
			System.out.println("\t" + jupiterMoon.getName());
		}

		Set<HeavenlyBody> moons = new HashSet<>();
		for (HeavenlyBody planet : planets) {
			moons.addAll(planet.getSatellites());
		}

		System.out.println("All Moons");
		for (HeavenlyBody moon : moons) {
			System.out.println("\t" + moon.getName());
		}
	}
}