package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer{
    public Paladin(int health) {
        super(health);
        setPhysAtt(15);
        setPhysDef(0.5);
        setMagicDef(0.8);
        setHealHimself(25);
        setHealTeammate(10);
    }

    @Override
    public void physicalAttack(Hero hero){
        hero.setHealth(hero.getHealth() - getPhysAtt() * hero.getPhysDef());
        if (hero.getHealth() < MIN_HEALTH)
            hero.setHealth(MIN_HEALTH);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
        if (getHealth() > MAX_HEALTH)
            setHealth(MAX_HEALTH);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
        if (hero.getHealth() > MAX_HEALTH)
            hero.setHealth(MAX_HEALTH);
    }

    @Override
    public String toString() {
        return "Paladin{health="+ (int)getHealth() + "}";
    }
}
