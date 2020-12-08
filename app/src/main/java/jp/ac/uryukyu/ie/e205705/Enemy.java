package jp.ac.uryukyu.ie.e205705;

/**
 * 敵クラス。 String name; //敵の名前 int hitPoint; //敵のHP int attack; //敵の攻撃力 boolean
 * dead; //敵の生死状態。true=死亡。 Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
    

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      モンスター名
     * @param maximumHP モンスターのHP
     * @param attack    モンスターの攻撃力
     */
    public Enemy(String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }

    

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * 
     * @param damage 受けたダメージ
     */
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    
    /**
     * フィールド変数hitPointのgetterメソッド。
     * 
     * @return this.hitPoint enemyの体力
     */
    public int gethitPoint() {
        return this.hitPoint;
    }
    /**
     * フィールド変数attackのgetterメソッド。
     * 
     * @return this.attack enemyの攻撃力
     */
    public int getattack() {
        return this.attack;
    }
    
    /**
     * フィールド変数nameのsetterメソッド。
     * 
     * @param _name　フィールド変数nameに保存したい名前
     */
    public void setname(String _name) {
        this.name = _name;
    }
    /**
     * フィールド変数hitPointのsetterメソッド。
     * 
     * @param _hitPoint　フィールド変数hitPointに保存したい体力の数値
     */
    public void sethitPoint(int _hitPoint) {
        this.hitPoint = _hitPoint;
    }
    /**
     * フィールド変数attackのsetterメソッド。
     * 
     * @param _attack　フィールド変数attackに保存したい攻撃力の数値
     */
    public void setattack(int _attack) {
        this.attack = _attack;
    }
    /**
     * フィールド変数deadのsetterメソッド。
     * 
     * @param _dead　フィールド変数deadに保存したい生死判定
     */
    public void setdead(boolean _dead) {
        this.dead = _dead;
    }

}
