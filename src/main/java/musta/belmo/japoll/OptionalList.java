package musta.belmo.japoll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

public class OptionalList<T> extends ArrayList<T> {
	
	public OptionalList() {
	
	}
	
	public OptionalList(Collection<T> collection) {
		super(collection);
	}
	
	public Optional<T> getOptional(int index) {
		final Optional<T> foundItem;
		if (index < 0 || (index == 0 && isEmpty()) || index >= size()) {
			foundItem = Optional.empty();
		} else {
			foundItem = Optional.ofNullable(super.get(index));
		}
		return foundItem;
	}
	
	public static <R> OptionalList<R> of(R... items) {
		return new OptionalList<>(Arrays.asList(items));
	}
}
