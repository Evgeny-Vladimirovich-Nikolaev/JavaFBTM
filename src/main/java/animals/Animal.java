public class Animal {

    protected String species;
    protected String name;
    protected int runningDistance;
    protected int runningLimit;
    protected int swimmingDistance;
    protected int swimmingLimit;
    protected boolean isTired;

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
                System.out.println(name + move + metres + " метров.");
            } else {
                System.out.println(name + move + "только " + (limit - distance) + " метров. Больше не может.");
                distance = limit;
            }
            isTired = distance == limit;
        }
        return distance;
    }

    protected void cantMove() {
        if(runningDistance != 0) {
            System.out.println(name + " уже пробежал " + runningDistance + " метров.");
        }
        if(swimmingDistance != 0) {
            System.out.println(name + " уже проплыл " + swimmingDistance + " метров.");
        }
        System.out.println(name + " устал и не может ни бежать, ни плыть.");
    }
}
