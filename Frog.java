public class Frog {

    private String name;
    private Heart frogHeart; // Композиція

    public Frog(String name) {
        this.name = name;
        this.frogHeart = new Heart(); // Композиція: створення частини в середині
    }

    public void printDescription() {
        System.out.println("Це жаба з іменем: " + name);
        frogHeart.pump();
    }

    // Внутрішній клас (inner class)
    public class Heart {
        public void pump() {
            System.out.println("Серце жаби б'ється нормально.");
        }
    }

    // Статичний вкладений клас (nested static class)
    public static class BiologyEnvironment {
        public void printInfo() {
            System.out.println("Жаби живуть біля води і на суші.");
        }
    }

    // Метод з локальним класом
    public void showStages() {
        class Tadpole {
            public void growUp() {
                System.out.println("Пуголовок перетворюється на дорослу жабу.");
            }
        }

        Tadpole little = new Tadpole();
        little.growUp();
    }

    public String getName() {
        return name;
    }
}
