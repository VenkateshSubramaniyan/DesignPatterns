package behavioural.template;

/**
 * in template pattern , the core logic is called from Abstract template class
 *                      Implementation calls will have the implementation methods which will be called by template class
 *
 */


public class TemplateDemo {
    public static void main(String[] args) {
        SportsCenter sportsCenter = new SportsCenter();
        sportsCenter.reserve(new Tournament("Venkat"),4);
        sportsCenter.reserve(new Tournament("Kumar"),2);

        TournamentRegistrationTemplate registrationTemplate = new TennisRegistrationTemplate(sportsCenter);
        System.out.println( registrationTemplate.register(new Request("Venkat",25,65)));
        System.out.println( registrationTemplate.register(new Request("madhavan",9,65)));
        System.out.println( registrationTemplate.register(new Request("Kumar",28,89)));

    }
}
