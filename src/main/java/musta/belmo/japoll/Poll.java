package musta.belmo.japoll;

import java.util.Optional;

public class Poll {
	private SearchableCollection<PollItem> pollItems = new SearchableCollection<>();
	
	public void add(PollItem poll) {
		pollItems.add(poll);
	}
	
	public void answer(PollItem poll, Response response) {
		poll.doAnswer(response);
	}
	
	public void answer(int index, Response response) {
		Optional<PollItem> pollItem = pollItems.getOptional(index);
		pollItem.ifPresent(item -> answer(item, response));
	}
	
	public int result(){
		return (int) pollItems.stream()
				.filter(PollItem::isCorrect)
				.count();
	}
}
