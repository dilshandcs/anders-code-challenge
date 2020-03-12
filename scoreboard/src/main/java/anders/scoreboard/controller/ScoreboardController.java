package anders.scoreboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anders.scoreboard.model.Scores;
import anders.scoreboard.service.ScoreboardService;

@RestController
@RequestMapping("/api/")
public class ScoreboardController {
	
	@Autowired
    ScoreboardService scoreboardService;

	// Get all scores that are sorted by the score (desc)
	@GetMapping("")
	public List<Scores> getAllScores() {
	    return scoreboardService.getAllScores();
	}
	
}
