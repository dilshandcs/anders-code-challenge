package anders.scoreboard.service;

import java.util.List;
import anders.scoreboard.model.Scores;

public interface ScoreboardService {
	public List<Scores> getAllScores();
	public Scores savePlayerScore(Scores scoreDetails);
}
