package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer{
    public Shaman(int health) {
        super(health);
        setPhysAtt(10);
        setMagicAtt(15);
        setPhysDef(0.8);
        setMagicDef(0.8);
        setHealHimself(50);
        setHealTeammate(30);
    }

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
        if (getHealth() > MAX_HEALTH)
            setHealth(MAX_HEALTH);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        if (hero.getHealth() > MAX_HEALTH)
            hero.setHealth(MAX_HEALTH);
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - getPhysAtt() * hero.getPhysDef());
        if (hero.getHealth() < MIN_HEALTH)
            hero.setHealth(MIN_HEALTH);
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth() - getMagicAtt() * hero.getMagicDef());
        if (hero.getHealth() < MIN_HEALTH)
            hero.setHealth(MIN_HEALTH);
    }

    @Override
    public String toString() {
        return "Shaman{health=" + (int)getHealth() + "}";
    }
}
