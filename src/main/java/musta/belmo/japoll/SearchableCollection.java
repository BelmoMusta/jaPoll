package musta.belmo.japoll;

import java.util.Objects;
import java.util.Optional;

public class SearchableCollection<T> extends OptionalList<T> {
	
	public Optional<T> find(T t) {
		return stream()
				.filter(currentElement -> Objects.equals(currentElement, t))
				.findFirst();
	}
}
