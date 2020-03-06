public class Rover {
    public static final Integer N = 1;
    public static final Integer E = 2;
    public static final Integer S = 3;
    public static final Integer W = 4;


    public Integer x = 0;
    public Integer y = 0;
    public Integer route = N;


    public Rover(int x, int y, int route) {
        this.x = x;
        this.y = y;
        this.route = route;
    }

    public void setPosition(int x, int y, int route) {
        this.x = x;
        this.y = y;
        this.route = route;

    }

    public void process(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                turnLeft();
            } else if (s.charAt(i) == 'R') {
                turnRight();
            } else {
                move();
            }
        }
    }

    public void move() {
        if (this.route == N) {
            this.y++;
        } else if (this.route == E) {
            this.x++;
        } else if (this.route == S) {
            this.y--;
        } else if (this.route == W) {
            this.x--;
        }
    }

    public void turnRight() {
        if (this.route + 1 > W) {
            this.route = N;
        } else {
            this.route++;
        }
    }

    public void turnLeft() {
        if (this.route - 1 < N) {
            this.route = W;
        } else {
            this.route = route - 1;
        }
    }


    public void printLocation() {
        String temp;
        if (this.route == N) {
            temp = "N";
        } else if (this.route == E) {
            temp = "E";
        } else if (this.route == S) {
            temp = "S";
        } else {
            temp = "W";
        }

        System.out.println(x + " " + y + " " + temp);
    }


}
