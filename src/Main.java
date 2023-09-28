
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamag(22);
        boss.setHils(300);
        Weapon weapon = new Weapon();
        weapon.setName("sword");
        weapon.setType("cold weapon");
        boss.setWeapon(weapon);
        System.out.println(boss.getDamag() +" "+ boss.getHils() + boss.getWeapon().getType() + boss.getWeapon().getName());
    }
}