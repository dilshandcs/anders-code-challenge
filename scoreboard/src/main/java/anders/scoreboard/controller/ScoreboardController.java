package anders.scoreboard.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	// Save score of the player
	@PostMapping("addScore")
	public ResponseEntity<?> savePlayerScore(@Valid @RequestBody Scores scoreDetails) {
		scoreboardService.savePlayerScore(scoreDetails);
		return ResponseEntity.ok().build();
	}
}
