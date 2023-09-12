package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{

    private int magicAtt;

    public Magician() {
        setPhysAtt(5);
        setMagicAtt(20);
        setPhysDef(1);
        setMagicDef(0.2);
    }

    public int getMagicAtt() {
        return magicAtt;
    }

    public void setMagicAtt(int magicAtt) {
        this.magicAtt = magicAtt;
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


