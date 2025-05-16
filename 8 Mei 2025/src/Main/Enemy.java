package Main;

import org.omg.CORBA.DomainManager;

public class Enemy implements IAttack, IDamageable {
    String Name;
    HP Hp;
    Integer Damage;
    Integer Defense;

    public Enemy(String Name, HP Hp, Integer Damage, Integer Defense){
        this.Name = Name;
        this.Hp = Hp;
        this.Damage = Damage;
        this.Defense = Defense;
    }

    @Override
    public void attack(IDamageable damageable){
        System.out.println("Tes");
        damageable.takeDamage(Damage, Defense);
    }

    @Override
    public int takeDamage(int damage, int defense){
        Integer totDamage = damage - defense;
        if(totDamage <= 0){
            totDamage = 0;
        }
        System.out.println("Damage give = " + totDamage);
        return totDamage;
    }

    public void showHP(){
        Hp.showHP(Name);
    }
}
