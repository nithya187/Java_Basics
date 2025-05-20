interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Guitar");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Football f = new Football();
        Guitar g = new Guitar();

        f.play();
        g.play();
    }
}
