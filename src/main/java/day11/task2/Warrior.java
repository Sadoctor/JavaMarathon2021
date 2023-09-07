package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior(int health) {
        super(health);
        setPhysAtt(30);
        setPhysDef(0.2);
        setMagicDef(1);
    }
    public void physicalAttack(Hero hero){
        hero.setHealth(hero.getHealth() - getPhysAtt() * hero.getPhysDef());
        if (hero.getHealth() < MIN_HEALTH)
            hero.setHealth(MIN_HEALTH);
    }

    @Override
    public String toString() {
        return "Warrior{health=" + (int)getHealth() + "}";
    }
}
