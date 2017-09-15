/**
 * Created by jc431075 on 15/09/17.
 */
public class DemoHorses
{
    public static void main(String[] args)
    {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setBirthYear(2008);
        horse1.setColor("red");
        horse1.setName("yellowHorse");
        horse2.setBirthYear(2990);
        horse2.setName("sam");
        horse2.setColor("green");
        horse2.setRaces(84);
        System.out.println("name: "+horse1.getName()+ "\nbday: "+horse1.getBirthYear()+"\ncolor: "+horse1.getColor());
        System.out.println("\nname: "+horse2.getName()+ "\nbday: "+horse2.getBirthYear()+"\ncolor: "+horse2.getColor()+ "\nraces: "+horse2.getRaces());
    }
}
