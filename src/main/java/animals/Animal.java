public class Animal {

    private  String species;
    private String name;
    private int runningDistance;
    private int runningLimit;
    private int swimmingDistance;
    private int swimmingLimit;
    private boolean isTired;

    Animal(String species, String name, int runningLimit, int swimmingLimit) {
        this.species = species;
        this.name = name;
        this.runningLimit = runningLimit;
        this.swimmingLimit = swimmingLimit;
    }

    protected String getSpecies () {
        return species;
    }

    protected String getName() {
        return name;
    }

    protected void run(int metres) {
        runningDistance = move(runningLimit, runningDistance, metres, " пробежал ");
    }

    protected void swim(int metres) {
        swimmingDistance = move(swimmingLimit, swimmingDistance, metres, " проплыл ");
    }

    protected int move(int limit, int distance, int metres, String move) {
        if (isTired) {
            cantMove();
        } else {
            if (distance + metres <= limit) {
                distance += metres;
                System.out.println(name + move + metres + " м (всего " + distance + " м).");
            } else {
                System.out.println(name
                        + move
                        + "только "
                        + (limit - distance)
                        + " м (всего "
                        + limit
                        + " м). Больше не может.");
                distance = limit;
            }
            isTired = distance == limit;
        }
        return distance;
    }

    protected void cantMove() {
        if (runningDistance != 0) {
            System.out.println(name + " уже пробежал " + runningDistance + " метров.");
        }
        if (swimmingDistance != 0) {
            System.out.println(name + " уже проплыл " + swimmingDistance + " метров.");
        }
        System.out.println(name + " устал и не может ни бежать, ни плыть.");
    }
}
