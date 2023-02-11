package animal;

// Animal クラスを継承し、Thinkable インターフェイスを実装
public class Human extends Animal implements Thinkable {
    // 趣味の情報を保管するフィールドを定義
    private String shumi;

    // 引数なしのコンストラクタ
    public Human() {

    }

    // 引数ありのコンストラクタ
    public Human(String name, int age, String shumi) {
        super(name, age);
        this.shumi = shumi;
    }

    // think メソッドを実装
    @Override
    public void think() {
        System.out.println("私は" + shumi + "について考えています。");

    }

}
