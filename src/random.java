public class random {
    public static void main(String[] args) throws Exception {
int modulus = 13;
int multiplier = 12;
int increment = 414;
int seed = 14;
int newSeed;
int period = 100;

newSeed = seed;

System.out.println("The seed is: " + seed);

do {
	period += 1;
newSeed = (newSeed * multiplier + increment) % modulus;
System.out.println(newSeed);
} while (newSeed != seed);

System.out.println("The period is: " + period);

}
}