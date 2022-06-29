import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class MaxFinder {

	public static void main(String[] args) {
		Optional<Integer> x = new MaxFinder().getMax(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println(x.get());

	}

	public Optional<Integer> getMax(Collection<Integer> collection) {
		return collection.stream().max(Integer::compare);

	}

}
