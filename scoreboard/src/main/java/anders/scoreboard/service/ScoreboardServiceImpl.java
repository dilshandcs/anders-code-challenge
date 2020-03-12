package anders.scoreboard.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import anders.scoreboard.model.Scores;
import anders.scoreboard.repository.ScoresRepository;

@Service
@Transactional
public class ScoreboardServiceImpl implements ScoreboardService{

	@Autowired
	ScoresRepository scoresRepository;
	
	@Override
	public List<Scores> getAllScores() {
		return scoresRepository.findAllByOrderByScoreDesc();
	}

	@Override
	public Scores savePlayerScore(Scores scoreDetails) {
		return scoresRepository.save(scoreDetails);
	}

}
