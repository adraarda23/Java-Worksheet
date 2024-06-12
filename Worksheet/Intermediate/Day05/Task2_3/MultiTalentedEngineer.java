package Day05.Task2_3;

public class MultiTalentedEngineer extends Engineer implements Blogger, Parent, TeamFan, InstrumentPlayer, JavaEnthusiast {
    public MultiTalentedEngineer(String name) {
        super(name);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        blog();
        parent();
        teamFan();
        playInstrument();
        javaEnthusiast();
    }

	@Override
	public void HiTeamFan() {
		System.out.println("This is from Team Fan method");
		
	}
}

