/**
 * JavaCore.HW1
 * @author Trusina Irina
 * @version 13.01.23
 */

public class HW1 {
    public static void main(String[] args) {

        Team team1 = new Team("Stars", new Member[4]);                  //команда 1
        team1.members[0] = new Member("Tom", 15);
        team1.members[1] = new Member("John", 16);
        team1.members[2] = new Member("Alex", 14);
        team1.members[3] = new Member("Max", 16);

        System.out.println(team1 + "\n");

        Team team2 = new Team("Чемпионы", new Member[4]);               //Команда 2
        team2.members[0] = new Member("Олег", 16);
        team2.members[1] = new Member("Игорь", 17);
        team2.members[2] = new Member("Павел", 15);
        team2.members[3] = new Member("Андрей", 18);
  //      System.out.println(team2);

        ObstacleCourse obstacleCourse = new ObstacleCourse (new Course[3]);              //Полоса препятствий
        obstacleCourse.courses[0] = new Course("Бег", 5);
        obstacleCourse.courses[1] = new Course("Отжимания", 6);
        obstacleCourse.courses[2] = new Course("Приседания", 4);
        System.out.println(obstacleCourse);

        obstacleCourse.doIt(team1);
        System.out.println(team1 + "\n");
  //      obstacleCourse.doIt(team2.members);
  //      System.out.println(team2 + "\n");
  //      Team.showResults();
    }
}
