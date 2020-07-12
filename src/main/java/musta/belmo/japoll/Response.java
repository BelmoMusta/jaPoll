package musta.belmo.japoll;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Comparator;

@Data
@EqualsAndHashCode(of = "value")
public class Response implements Comparable<Response> {
	private int value;
	private String wording;
	
	public int compareTo(Response o) {
		return Comparator.comparing(Response::getValue)
				.compare(this, o);
	}
}
