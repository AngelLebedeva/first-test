public class Cat implements Animal{
    @Override
    public void See() {
        System.out.println("Плохо!");
    }

    @Override
    public void Talk() {
        System.out.println("Мяу-мяу!");
    }
}
