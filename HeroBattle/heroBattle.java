package HeroBattle;

public class heroBattle {

    private String name;
    private Double hp;
    private Double attack;
    private Double defense;

    public heroBattle(){
        this.name = "";
        this.hp = 0.0;
        this.attack = 0.0;
        this.defense = 0.0;
    }

    public heroBattle(String name, double hp, double attack, double defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setHp(Double hp){
        this.hp = hp;
    }

    public void setAttack(Double attack){
        this.attack = attack;
    }

    public void setDefense(Double defense){
        this.defense = defense;
    }

    public String getName(){
        return name;
    }

    public Double getHp(){
        return hp;
    }

    public Double getAttack(){
        return attack;
    }

    public Double getDefense(){
        return defense;
    }

    public void attackPower(heroBattle hero) {
        double damage = attack - hero.getDefense();
        if (damage > 0) {
            double sisaHp = hero.getHp() - damage;
            hero.setHp(hero.getHp() - damage);
            hero.setHp(Math.max(sisaHp, 0));
        }
    }
    
    
}


