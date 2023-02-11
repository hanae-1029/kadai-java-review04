package animal;

public class Animal {
    // 名前を格納するフィールド
    private String name;
    // 年齢を格納するフィールド
    private int age;

    // 引数なしのコンストラクタ
    public Animal() {
    }

    // 引数ありのコンストラクタ
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // say という名前のpublicなメソッドを定義
    public void say() {
        System.out.println(this.name + "です。" + this.age + "です。");

    }

}
