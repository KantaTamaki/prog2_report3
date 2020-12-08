package jp.ac.uryukyu.ie.e205705;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackTest() {
        
        Warrior warrior = new Warrior("デモ勇者", 10, 100);
        int enemyHp = (int)(1.5*3*warrior.attack);
        Enemy slime = new Enemy("スライムもどき", enemyHp, 0);
        for(int i=0;i<3;i++){
            warrior.attackWithWeponSkill(slime);
        }
        
        assertEquals(0, slime.gethitPoint());
    }
    
}
