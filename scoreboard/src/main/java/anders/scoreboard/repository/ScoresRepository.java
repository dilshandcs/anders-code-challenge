package anders.scoreboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import anders.scoreboard.model.Scores;

@Repository
public interface ScoresRepository extends JpaRepository<Scores, Long> {
	public List<Scores> findAllByOrderByScoreDesc();
}
