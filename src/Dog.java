public class Dog implements Animal{

    @Override
    public void See() {
        System.out.println("Зорко!");
    }

    @Override
    public void Talk() {
        System.out.println("Гав-гав!");
    }
}
