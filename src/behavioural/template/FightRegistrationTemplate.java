package behavioural.template;


public class FightRegistrationTemplate extends TournamentRegistrationTemplate {

    private final SportsCenter sportCenter;

    public FightRegistrationTemplate(SportsCenter sportscenter) {
        super(new Tournament("Fight Tournament"));
        this.sportCenter = sportscenter;
    }

    @Override
    protected boolean canRegister(Request request) {
        if (request.getAge() < 15) {
            // children under 15 cannot sign up
            return false;
        }

        if (request.getWeight() < 60) {
            // minimum weight, 60 kilos
            return false;
        }
        return true;
    }

    @Override
    protected int getNumberOfParticipants() {
        return 6;
    }

    @Override
    protected void closeTournament() {
        // places sold out -> we reserve sports center
        // The estimated time of the tournament is 4 hours
        sportCenter.reserve(tournament, 4);
    }

}
