package behavioural.template;


public class TennisRegistrationTemplate extends TournamentRegistrationTemplate {

    private final SportsCenter sportCenter;

    public TennisRegistrationTemplate(SportsCenter sportCenter) {
        super(new Tournament("tennis tournament"));
        this.sportCenter = sportCenter;
    }

    @Override
    protected boolean canRegister(Request request) {
        // children under 10 cannot sign up
        return request.getAge() >= 10;
    }

    @Override
    protected int getNumberOfParticipants() {
        return 4;
    }

    @Override
    protected void closeTournament() {
        // full places -> we reserve sports center
        // The estimated duration of the tournament is 8 hours
        sportCenter.reserve(tournament, 8);
    }

}
