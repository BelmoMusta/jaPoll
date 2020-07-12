package musta.belmo.japoll;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PollItem {
	
	private int id;
	private String content;
	private SearchableCollection<Response> possibleResponses;
	private Response valideResponse;
	private Response providedResponse;
	
	public void doAnswer(Response response) {
		this.providedResponse = possibleResponses
				.find(response)
				.orElseThrow(() -> new RuntimeException(""));
		
	}
	 public boolean isCorrect(){
		
		return  providedResponse != null && providedResponse.equals(valideResponse);
	 }
	
}
