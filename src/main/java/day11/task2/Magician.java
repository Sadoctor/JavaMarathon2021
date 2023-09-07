package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician(int health) {
        super(health);
        setPhysAtt(5);
        setMagicAtt(20);
        setPhysDef(1);
        setMagicDef(0.2);
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
        return "Magician{health=" + (int)getHealth() + "}";
    }
}


