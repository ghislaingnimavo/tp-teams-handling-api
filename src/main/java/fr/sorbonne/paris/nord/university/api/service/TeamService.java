package fr.sorbonne.paris.nord.university.api.service;

import fr.sorbonne.paris.nord.university.api.entity.Team;
import fr.sorbonne.paris.nord.university.api.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    public Team insertTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team updateTeam(Team team) {
        return teamRepository.save(team);
    }

    public void deleteTeamById(Long id) {
        teamRepository.deleteById(id);
    }
}
